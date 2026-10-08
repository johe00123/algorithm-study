# 해시 함수를 이용해서 리스트 안 알파벳 개수를 세서 딕셔너리로 출력!

en = ["a", "b", "a", "c", "v", "b"]

count = {}

for n in en:
    count[n] = count.get(n, 0) + 1 
print(count)