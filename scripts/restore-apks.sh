#!/usr/bin/env bash
# Ghép các file docs/apks/*.part-* thành APK gốc (GitHub chặn file > 100MB nên APK được cắt nhỏ)
# rồi kiểm tra SHA-256. Kết quả nằm ở docs/apks/ và bị .gitignore bỏ qua.
set -euo pipefail
cd "$(dirname "$0")/../docs/apks"

for name in $(ls *.part-aa | sed 's/\.part-aa$//'); do
  if [[ -f "$name" ]]; then
    echo "skip  $name (đã có)"
  else
    cat "$name".part-* > "$name"
    echo "built $name"
  fi
done

shasum -a 256 -c SHA256SUMS
