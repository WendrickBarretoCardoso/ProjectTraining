# Binary to Decimal Converter

> **Idea from:** https://github.com/florinpop17/app-ideas

**Demo:** Codesandbox

**Nível:** 🟢 1 - Iniciante

## 📖 Descrição

O sistema binário é a base de todos os computadores digitais. Por isso, é importante que desenvolvedores compreendam a matemática em **base 2 (binário)**.

O objetivo deste projeto é criar uma aplicação chamada **Bin2Dec**, que permita ao usuário inserir uma sequência de até **8 dígitos binários** (composta apenas por `0` e `1`) e exibir seu equivalente em **decimal (base 10)**.

Além de praticar lógica de programação, este desafio ajuda a entender como ocorre a conversão entre sistemas numéricos.

---

## 📌 Regras do Desafio

A implementação deve seguir as seguintes restrições:

- Não utilizar **arrays** para armazenar os dígitos binários informados pelo usuário.
- O valor decimal correspondente a cada dígito binário deve ser calculado utilizando **uma única função matemática**, em vez de tabelas prontas ou listas. Cabe ao desenvolvedor escolher qual função utilizar.

---

## ✅ Histórias do Usuário (User Stories)

- [x] O usuário pode inserir até **8 dígitos binários** em um único campo de entrada.
- [x] O usuário deve ser notificado caso digite qualquer caractere diferente de `0` ou `1`.
- [x] O sistema deve exibir o valor correspondente em **decimal (base 10)** em um único campo de saída.

---

## ⭐ Funcionalidade Bônus

- [x] Permitir que o usuário insira uma quantidade **variável** de dígitos binários, em vez de limitar a entrada a apenas 8 caracteres.


## 📚 Exemplo

| Binário | Decimal |
|---------:|--------:|
| `1` | `1` |
| `10` | `2` |
| `101` | `5` |
| `1000` | `8` |
| `11111111` | `255` |