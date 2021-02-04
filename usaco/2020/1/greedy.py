def solve():
  n = int(input())
  students = input()

  i = 0
  while(i < len(students) and students[i] != 'A'):
    i += 1
  
  count = 0
  maxCount = 0
  
  for j in range(i, len(students)):
    if students[j] == 'P':
      count += 1
    else:
      count = 0

    maxCount = max(maxCount, count)

  print(maxCount)





t = int(input())
for i in range(t):
  solve()
