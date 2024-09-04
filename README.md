# Калькулятор (Консольное приложение)

## Описание
Данный проект представляет собой консольное приложение под названием "Калькулятор". Приложение считывает ввод пользователя из консоли, выполняет арифметические операции между двумя числами и выводит результат в консоль. Приложение реализовано на Java и включает класс `Main` с методом `public static String calc(String input)`, который принимает строку, представляющую арифметическое выражение, и возвращает строку с результатом выполнения операции.

## Функциональность
- **Арифметические операции:** Поддерживаются операции сложения (`+`), вычитания (`-`), умножения (`*`) и деления (`/`) между двумя числами.
- **Обработка ввода:** Калькулятор принимает ввод в одной строке, например, `a + b`, где `a` и `b` — целые числа.
- **Работа с целыми числами:** Приложение работает только с целыми числами. Результат деления представляет собой целое число, остаток отбрасывается.
- **Ограничение на диапазон:** Входные числа должны быть в диапазоне от 1 до 10 включительно. Выходные числа не ограничены по величине и могут быть любыми.
- **Обработка ошибок:** 
  - Программа выбрасывает исключения при некорректном вводе, например, при введении нецелых чисел, чисел вне допустимого диапазона или неправильно сформатированных арифметических выражений.
  - Программа завершает свою работу, если встречает исключение.
