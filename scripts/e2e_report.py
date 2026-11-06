#!/usr/bin/env python3
"""Builds build/e2e-report/index.html + README.md from the step records written by the
instrumented E2E tests (app/src/androidTest/.../e2e/E2EReport.kt).

Input layout (already copied into the report dir):
    <report>/<NN-flow>/<NN-step>.png|.json
    <report>/device-<Test>.json
Optional: --junit <dir> (JUnit XML from Gradle) adds test-level pass/fail; --serial / --avd add
device details; --no-device writes a report that says nothing ran on a device, listing the JVM
unit-test results instead (D-212 fallback).

Self-contained: inline CSS, relative image paths, no external assets.
"""
import argparse
import datetime as dt
import glob
import html
import json
import os
import re
import sys
import xml.etree.ElementTree as ET


def load_steps(report):
    steps = []
    for path in sorted(glob.glob(os.path.join(report, "*", "*.json"))):
        try:
            with open(path, encoding="utf-8") as f:
                steps.append(json.load(f))
        except (OSError, ValueError) as e:
            print(f"warning: skipping {path}: {e}", file=sys.stderr)
    flows = {}
    for s in steps:
        flows.setdefault(s["flow"], {"title": s.get("flowTitle", s["flow"]), "steps": []})["steps"].append(s)
    for f in flows.values():
        f["steps"].sort(key=lambda s: s.get("index", 0))
    return dict(sorted(flows.items()))


def load_device(report):
    for path in sorted(glob.glob(os.path.join(report, "device-*.json"))):
        try:
            with open(path, encoding="utf-8") as f:
                return json.load(f)
        except (OSError, ValueError):
            pass
    return {}


def load_junit(paths):
    results = []
    for root in paths:
        for path in glob.glob(os.path.join(root, "**", "*.xml"), recursive=True):
            try:
                tree = ET.parse(path)
            except ET.ParseError:
                continue
            for case in tree.iter("testcase"):
                failed = case.find("failure") is not None or case.find("error") is not None
                skipped = case.find("skipped") is not None
                results.append({
                    "class": case.get("classname", ""),
                    "name": case.get("name", ""),
                    "status": "SKIP" if skipped else ("FAIL" if failed else "PASS"),
                })
    return results


CSS = """
:root{--bg:#f6f8f7;--card:#fff;--fg:#171d1b;--muted:#5b6461;--line:#dde4e1;--pass:#2e7d32;--fail:#c62828;--accent:#006a60}
@media (prefers-color-scheme:dark){:root{--bg:#0e1513;--card:#1b2120;--fg:#dde4e1;--muted:#a9b3af;--line:#303635;--pass:#81c995;--fail:#ff8a80;--accent:#53dbc9}}
*{box-sizing:border-box}body{margin:0;background:var(--bg);color:var(--fg);font:15px/1.45 system-ui,-apple-system,Roboto,sans-serif}
main{max-width:1200px;margin:0 auto;padding:16px}
h1{font-size:24px;margin:8px 0}h2{font-size:19px;margin:28px 0 8px}
.meta{color:var(--muted);font-size:13px}.meta b{color:var(--fg)}
.summary{display:flex;flex-wrap:wrap;gap:8px;margin:12px 0}
.pill{border-radius:999px;padding:4px 12px;font-weight:600;font-size:13px;background:var(--card);border:1px solid var(--line)}
.pill.pass{color:var(--pass)}.pill.fail{color:var(--fail)}
nav ol{padding-left:20px}nav a{color:var(--accent)}
.strip{display:grid;grid-template-columns:repeat(auto-fill,minmax(210px,1fr));gap:12px}
.step{background:var(--card);border:1px solid var(--line);border-radius:14px;overflow:hidden;display:flex;flex-direction:column}
.step.fail{border-color:var(--fail);border-width:2px}
.step img{width:100%;display:block;background:#000;aspect-ratio:9/20;object-fit:contain}
.step .noimg{aspect-ratio:9/20;display:flex;align-items:center;justify-content:center;color:var(--muted)}
.cap{padding:10px 12px;font-size:13px}.cap .n{font-weight:700}.cap .act{margin-top:4px}.cap .exp{color:var(--muted);margin-top:2px}
.st{font-weight:700;font-size:12px}.st.PASS{color:var(--pass)}.st.FAIL{color:var(--fail)}
.err{color:var(--fail);font-family:ui-monospace,monospace;font-size:12px;white-space:pre-wrap;word-break:break-word;margin-top:6px}
table{border-collapse:collapse;width:100%;background:var(--card);font-size:13px}td,th{border:1px solid var(--line);padding:6px 8px;text-align:left}
@media (max-width:480px){main{padding:12px}.strip{grid-template-columns:repeat(2,1fr);gap:8px}.cap{padding:8px;font-size:12px}}
"""


def esc(v):
    return html.escape("" if v is None else str(v))


def build_html(flows, device, junit, args, generated):
    total = sum(len(f["steps"]) for f in flows.values())
    failed = sum(1 for f in flows.values() for s in f["steps"] if s.get("status") != "PASS")
    out = ["<!doctype html><html lang='en'><head><meta charset='utf-8'>",
           "<meta name='viewport' content='width=device-width,initial-scale=1'>",
           "<title>Unified Health E2E report</title><style>", CSS, "</style></head><body><main>",
           "<h1>Unified Health — E2E report</h1>"]
    dev = ", ".join(x for x in [
        f"<b>{esc(device.get('manufacturer'))} {esc(device.get('model'))}</b>" if device else "",
        f"Android {esc(device.get('release'))} (API {esc(device.get('sdk'))})" if device else "",
        "emulator" if device.get("emulator") else ("physical device" if device else ""),
        f"serial <b>{esc(args.serial)}</b>" if args.serial else "",
        f"AVD <b>{esc(args.avd)}</b>" if args.avd else "",
    ] if x)
    out.append(f"<p class='meta'>Generated {esc(generated)} · {dev or 'no device'}</p>")
    if args.no_device:
        out.append("<p class='pill fail'>No emulator/device was available: instrumented flows did not run. "
                   "JVM unit tests below are the only results.</p>")
    out.append("<div class='summary'>")
    out.append(f"<span class='pill'>{len(flows)} flows</span><span class='pill pass'>{total - failed} steps passed</span>")
    out.append(f"<span class='pill {'fail' if failed else 'pass'}'>{failed} steps failed</span>")
    if junit:
        jf = sum(1 for j in junit if j["status"] == "FAIL")
        out.append(f"<span class='pill {'fail' if jf else 'pass'}'>tests: {len(junit) - jf}/{len(junit)} passed</span>")
    out.append("</div>")
    if flows:
        out.append("<nav><ol>")
        for key, f in flows.items():
            bad = any(s.get("status") != "PASS" for s in f["steps"])
            out.append(f"<li><a href='#{esc(key)}'>{esc(f['title'])}</a> — {len(f['steps'])} steps{' · <b>FAILED</b>' if bad else ''}</li>")
        out.append("</ol></nav>")
    for key, f in flows.items():
        out.append(f"<h2 id='{esc(key)}'>{esc(key[:2])}. {esc(f['title'])}</h2><div class='strip'>")
        for s in f["steps"]:
            status = s.get("status", "?")
            img = (f"<a href='{esc(s['screenshot'])}'><img loading='lazy' src='{esc(s['screenshot'])}' alt='{esc(s['step'])}'></a>"
                   if s.get("screenshot") else "<div class='noimg'>no screenshot</div>")
            err = f"<div class='err'>{esc(s.get('error'))}</div>" if s.get("error") else ""
            out.append(f"<div class='step {'fail' if status != 'PASS' else ''}'>{img}<div class='cap'>"
                       f"<div><span class='n'>{esc(s['step'])}</span> · <span class='st {esc(status)}'>{esc(status)}</span></div>"
                       f"<div class='act'>▶ {esc(s.get('action'))}</div><div class='exp'>✓ {esc(s.get('expected'))}</div>{err}</div></div>")
        out.append("</div>")
    if junit:
        out.append("<h2>Test cases</h2><table><tr><th>Class</th><th>Test</th><th>Result</th></tr>")
        for j in sorted(junit, key=lambda j: (j["class"], j["name"])):
            out.append(f"<tr><td>{esc(j['class'])}</td><td>{esc(j['name'])}</td><td class='st {esc(j['status'])}'>{esc(j['status'])}</td></tr>")
        out.append("</table>")
    out.append("</main></body></html>")
    return "".join(out), total, failed


def build_md(flows, device, junit, args, generated, total, failed):
    lines = ["# Unified Health — E2E report", "",
             f"Generated {generated}" + (f" · {device.get('manufacturer')} {device.get('model')}, Android {device.get('release')} (API {device.get('sdk')})" if device else "")
             + (f" · serial `{args.serial}`" if args.serial else "") + (f" · AVD `{args.avd}`" if args.avd else ""), "",
             f"**{len(flows)} flows · {total - failed}/{total} steps passed**" + ("  \n**No device: instrumented flows did not run.**" if args.no_device else ""), ""]
    for key, f in flows.items():
        lines += [f"## {key[:2]}. {f['title']}", "", "| # | Step | Action → expected | Result |", "|---|---|---|---|"]
        for s in f["steps"]:
            shot = f"![{s['step']}]({s['screenshot']})" if s.get("screenshot") else ""
            err = f"<br>`{s['error']}`" if s.get("error") else ""
            lines.append(f"| {s.get('index')} | {s['step']}<br>{shot} | {s.get('action')} → {s.get('expected')} | {s.get('status')}{err} |")
        lines.append("")
    if junit:
        lines += ["## Test cases", ""] + [f"- {j['status']} · {j['class']}.{j['name']}" for j in sorted(junit, key=lambda j: (j['class'], j['name']))]
    return "\n".join(lines) + "\n"


def main():
    p = argparse.ArgumentParser()
    p.add_argument("report", help="report directory (screenshots + step json already inside)")
    p.add_argument("--junit", action="append", default=[], help="directory with JUnit XML results")
    p.add_argument("--serial")
    p.add_argument("--avd")
    p.add_argument("--no-device", action="store_true")
    args = p.parse_args()
    os.makedirs(args.report, exist_ok=True)
    flows = load_steps(args.report)
    device = load_device(args.report)
    junit = load_junit(args.junit)
    generated = dt.datetime.now().astimezone().strftime("%Y-%m-%d %H:%M:%S %Z")
    page, total, failed = build_html(flows, device, junit, args, generated)
    with open(os.path.join(args.report, "index.html"), "w", encoding="utf-8") as f:
        f.write(page)
    with open(os.path.join(args.report, "README.md"), "w", encoding="utf-8") as f:
        f.write(build_md(flows, device, junit, args, generated, total, failed))
    print(f"{len(flows)} flows, {total} steps, {failed} failed -> {os.path.join(args.report, 'index.html')}")
    return 1 if failed else 0


if __name__ == "__main__":
    sys.exit(main())
