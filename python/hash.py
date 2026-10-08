# 해시 함수를 이용해서 리스트 안 알파벳 개수를 세서 딕셔너리로 출력!

en = ["a", "b", "a", "v", "c", "b", "b"]

count = {}

for n in en:
    count[n] = count.get(n, 0) + 1 
print(count)

# 정렬, value - 내림차순, key - 오름차순, 우선순위는 value 로 구현.
result = sorted(count.items(), key = lambda x: (-x[1], x[0]))
print(result)

for key, value in result:
    print(key, value)