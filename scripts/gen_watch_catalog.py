#!/usr/bin/env python3
"""Generate the watch model catalog and bundled product images from a research JSON file.

Usage: scripts/gen_watch_catalog.py <watch_catalog.json>

Writes:
  core/model/.../WatchCatalog.kt                 – ordered WatchModel list (regex per model)
  core/designsystem/.../WatchImages.kt           – model id -> drawable map
  core/designsystem/src/main/res/drawable-nodpi/watch_<id>.webp
                                                 – official image, trimmed, 512 px, transparent bg
  docs/watch-catalog.md                          – model table with image and regex sources
"""
import io
import json
import re
import ssl
import subprocess
import sys
import urllib.request
from pathlib import Path

from PIL import Image, ImageChops

try:
    import certifi

    SSL_CONTEXT = ssl.create_default_context(cafile=certifi.where())
except ImportError:  # pragma: no cover - certifi is a dev convenience, not a hard dependency
    SSL_CONTEXT = ssl.create_default_context()

ROOT = Path(__file__).resolve().parent.parent
MODEL_KT = ROOT / "core/model/src/main/kotlin/com/unified/health/core/model/WatchCatalog.kt"
IMAGES_KT = ROOT / "core/designsystem/src/main/kotlin/com/unified/health/core/designsystem/component/WatchImages.kt"
RES_DIR = ROOT / "core/designsystem/src/main/res/drawable-nodpi"
DOC = ROOT / "docs/watch-catalog.md"
SIZE = 512
UA = "Mozilla/5.0 (Macintosh; Intel Mac OS X 14_0) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.0 Safari/605.1.15"
VENDORS = {"GARMIN", "HUAWEI", "ZEPP", "COROS", "STANDARD"}
SHAPES = {"round": "ROUND", "square": "SQUARE", "band": "BAND"}


def kt_string(s: str) -> str:
    return '"' + s.replace("\\", "\\\\").replace('"', '\\"').replace("$", "\\$") + '"'


def fetch(url: str) -> bytes:
    # Huawei's CDN (consumer.huawei.com) 403s without a Referer from the product page and a
    # browser-like Accept-Language; harmless to send the same headers to every host.
    req = urllib.request.Request(
        url,
        headers={
            "User-Agent": UA,
            "Accept": "image/avif,image/webp,image/png,image/*",
            "Accept-Language": "en-US,en;q=0.9",
            "Referer": url,
        },
    )
    with urllib.request.urlopen(req, timeout=30, context=SSL_CONTEXT) as r:
        return r.read()


def make_transparent(img: Image.Image) -> Image.Image:
    """Knock out a flat near-white background (product shots on #fff) so the image sits on any theme."""
    img = img.convert("RGBA")
    if img.getchannel("A").getextrema()[0] < 250:
        return img  # already has transparency
    px = img.load()
    w, h = img.size
    corners = [px[0, 0], px[w - 1, 0], px[0, h - 1], px[w - 1, h - 1]]
    if not all(min(c[:3]) > 235 for c in corners):
        return img
    # Flood fill from the borders so white inside the watch face is kept.
    from collections import deque
    seen = bytearray(w * h)
    q = deque([(x, y) for x in range(w) for y in (0, h - 1)] + [(x, y) for y in range(h) for x in (0, w - 1)])
    while q:
        x, y = q.popleft()
        i = y * w + x
        if seen[i]:
            continue
        seen[i] = 1
        r, g, b, a = px[x, y]
        if min(r, g, b) < 225:
            continue
        px[x, y] = (r, g, b, 0)
        for nx, ny in ((x + 1, y), (x - 1, y), (x, y + 1), (x, y - 1)):
            if 0 <= nx < w and 0 <= ny < h and not seen[ny * w + nx]:
                q.append((nx, ny))
    return img


def process(data: bytes, out: Path) -> None:
    img = make_transparent(Image.open(io.BytesIO(data)))
    bbox = img.getchannel("A").point(lambda a: 255 if a > 8 else 0).getbbox()
    if bbox:
        img = img.crop(bbox)
    img.thumbnail((SIZE, SIZE), Image.LANCZOS)
    canvas = Image.new("RGBA", (SIZE, SIZE), (0, 0, 0, 0))
    canvas.paste(img, ((SIZE - img.width) // 2, (SIZE - img.height) // 2), img)
    png = out.with_suffix(".png")
    canvas.save(png)
    subprocess.run(["cwebp", "-quiet", "-q", "82", "-alpha_q", "90", str(png), "-o", str(out)], check=True)
    png.unlink()


def main(src: str) -> None:
    catalog = json.loads(Path(src).read_text())
    models = catalog["models"]
    RES_DIR.mkdir(parents=True, exist_ok=True)
    entries, images, rows, failed = [], [], [], []
    seen_ids = set()
    for m in models:
        mid, vendor = m["id"], m["vendor"]
        if vendor not in VENDORS or not re.fullmatch(r"[a-z0-9_]+", mid) or mid in seen_ids:
            print(f"skip {mid}: bad vendor/id/duplicate", file=sys.stderr)
            continue
        pattern = m.get("bleNameRegex")
        if not pattern:
            continue
        re.compile(pattern)
        seen_ids.add(mid)
        shape = SHAPES.get((m.get("shape") or "round").lower(), "ROUND")
        year = m.get("releaseYear")
        entries.append(
            f"        WatchModel({kt_string(mid)}, WearableVendor.{vendor}, {kt_string(m['displayName'])}, "
            f"Regex({kt_string(pattern)}, RegexOption.IGNORE_CASE), WatchShape.{shape}"
            + (f", releaseYear = {int(year)}" if isinstance(year, int) else "")
            + "),"
        )
        url = m.get("imageUrl")
        if url:
            out = RES_DIR / f"watch_{mid}.webp"
            try:
                if not out.exists():
                    process(fetch(url), out)
                images.append(mid)
            except Exception as e:  # noqa: BLE001 – report and keep going, the UI falls back to a glyph
                failed.append((mid, url, str(e)))
        rows.append(
            f"| `{mid}` | {m['displayName']} | `{pattern.replace('|', chr(92) + '|')}` | "
            f"{'✓' if mid in images else '—'} | {m.get('imageSourcePage') or ''} | {m.get('bleNameSource') or m.get('evidence') or ''} |"
        )

    MODEL_KT.write_text(
        "// Generated by scripts/gen_watch_catalog.py — edit the research JSON and regenerate, do not hand-edit.\n"
        "package com.unified.health.core.model\n\n"
        "/** Known watch products, specific patterns first; one `*_generic` fallback per brand. See docs/watch-catalog.md. */\n"
        "object WatchCatalog {\n"
        "    val models: List<WatchModel> = listOf(\n"
        + "\n".join(entries)
        + "\n    )\n}\n"
    )
    IMAGES_KT.write_text(
        "// Generated by scripts/gen_watch_catalog.py — do not hand-edit.\n"
        "package com.unified.health.core.designsystem.component\n\n"
        "import androidx.annotation.DrawableRes\n"
        "import com.unified.health.core.designsystem.R\n\n"
        "/** Official product image bundled for a [com.unified.health.core.model.WatchModel.id], if any. */\n"
        "@DrawableRes\n"
        "internal fun watchImageRes(modelId: String): Int? = when (modelId) {\n"
        + "".join(f"    {kt_string(i)} -> R.drawable.watch_{i}\n" for i in images)
        + "    else -> null\n}\n"
    )
    DOC.write_text(
        "# Watch model catalog\n\n"
        "Generated by `scripts/gen_watch_catalog.py`. Product images are © their manufacturers and are bundled only "
        "to help users recognise their own device (see D-801 in DECISIONS.md).\n\n"
        f"{catalog.get('notes', '')}\n\n"
        "| id | Model | BLE name regex | Image | Image source | Name evidence |\n|---|---|---|---|---|---|\n"
        + "\n".join(rows)
        + "\n"
    )
    print(f"{len(entries)} models, {len(images)} images")
    for f in failed:
        print("image failed:", *f, file=sys.stderr)


if __name__ == "__main__":
    main(sys.argv[1])
