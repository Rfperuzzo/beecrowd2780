# 🏀 Beecrowd 2780 — Basquete de Robôs

Solução desenvolvida em **Java** para o exercício **2780 — Basquete de Robôs**, da plataforma Beecrowd.

O objetivo do exercício é determinar quantos pontos uma cesta vale de acordo com a distância do robô até a cesta. :chatgpt-content-reference{index="0"}

---

## 📚 Objetivo

Este exercício trabalha principalmente com:

- Entrada de dados;
- Variáveis do tipo `int`;
- Estruturas condicionais;
- `if`, `else if` e `else`;
- Operadores relacionais;
- Verificação de intervalos;
- Tomada de decisão.

---

## 🧠 Lógica do problema

O programa recebe um valor inteiro `D`, que representa a distância do robô até o início da quadra, em centímetros.

A quantidade de pontos da cesta depende dessa distância:

| Distância | Pontuação |
|---|---:|
| `D ≤ 800` | 1 ponto |
| `800 < D ≤ 1400` | 2 pontos |
| `1400 < D ≤ 2000` | 3 pontos |

Assim, o programa verifica em qual intervalo a distância informada se encontra e exibe a pontuação correspondente.

---

## 📥 Exemplo de entrada

```text
700
