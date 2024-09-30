# LazyVim Keybindings Cheat Sheet

Este archivo README describe los atajos de teclado más útiles de **LazyVim**, una configuración de Neovim enfocada en la productividad y personalización.

## Movimientos Básicos:
- `h`, `j`, `k`, `l`: Moverse a la izquierda, abajo, arriba y derecha respectivamente.
- `Ctrl + u`: Desplazarse hacia arriba (medio archivo).
- `Ctrl + d`: Desplazarse hacia abajo (medio archivo).
- `gg`: Ir al inicio del archivo.
- `G`: Ir al final del archivo.

## Gestión de Buffers:
- `<leader>bn`: Ir al siguiente buffer.
- `<leader>bp`: Ir al buffer anterior.
- `<leader>bd`: Eliminar (cerrar) el buffer actual.
- `<leader>bl`: Listar todos los buffers abiertos.
- `<leader>bD`: Eliminar todos los buffers excepto el actual.

## Gestión de Ventanas (Splits):
- `Ctrl + w + v`: Abrir un split vertical.
- `Ctrl + w + s`: Abrir un split horizontal.
- `Ctrl + w + h/j/k/l`: Moverse entre ventanas (izquierda, abajo, arriba, derecha).

## Navegación por Archivos:
- `<leader>ff`: Abrir el buscador de archivos (Telescope).
- `<leader>fg`: Búsqueda de contenido en el proyecto (Telescope live grep).
- `<leader>fs`: Buscar y abrir archivos recientes.

## Gestión de Pestañas:
- `<leader>tn`: Crear una nueva pestaña.
- `<leader>tq`: Cerrar la pestaña actual.
- `gt`: Cambiar a la siguiente pestaña.
- `gT`: Cambiar a la pestaña anterior.

## Terminal Integrada:
- `<leader>tt`: Abrir terminal flotante.
- `<leader>tv`: Abrir terminal en split vertical.
- `<leader>th`: Abrir terminal en split horizontal.

## Acciones Generales:
- `<leader>w`: Guardar el archivo actual.
- `<leader>q`: Cerrar el archivo actual.
- `<leader>e`: Abrir el explorador de archivos (NvimTree).

## Atajos para el Código:
- `<leader>ca`: Realizar una acción de código (code action).
- `<leader>rn`: Renombrar símbolo en el código.
- `K`: Mostrar documentación (hover).

## Atajos para Git (si está configurado):
- `<leader>gd`: Ir a la definición de un símbolo.
- `<leader>gr`: Ver referencias de un símbolo.
- `<leader>gb`: Mostrar blame de Git en la línea actual.

## Gestión de Plugins:
- `<leader>ps`: Sincronizar plugins (Packer o Lazy.nvim).
- `<leader>pc`: Limpiar plugins no utilizados.

## Explorar Símbolos y Comentarios:
- `<leader>sv`: Mostrar vista de símbolos.
- `<leader>sc`: Comentar/Descomentar línea o bloque de código.

## Personalización
LazyVim permite personalizar estos atajos de teclado en el archivo de configuración. Puedes añadir, eliminar o modificar los mapeos según tus necesidades.

---

¡Aprovecha al máximo tu entorno de trabajo con LazyVim! 🚀
