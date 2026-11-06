#!/usr/bin/env bash
# End-to-end run: build → install (fresh) → run the instrumented flows (which pair the simulated
# watch, sync it and seed demo data through the debug menu) → pull the per-step screenshots →
# build build/e2e-report/index.html + README.md.
#
#   scripts/e2e.sh [serial]          # default: $ANDROID_SERIAL, else the first attached device
#   E2E_AVD=hc_api36 scripts/e2e.sh  # boot this AVD headless when no device is attached
#   E2E_SKIP_UNIT=1 scripts/e2e.sh   # skip JVM unit tests
#
# No device and no bootable AVD: JVM unit tests still run and the report says so (D-212).
set -uo pipefail
cd "$(dirname "$0")/.."
ROOT=$(pwd)
# The system JDK on this machine is broken; prefer Homebrew JDK 21 unless the given one actually runs.
if [[ -z "${JAVA_HOME:-}" ]] || ! "$JAVA_HOME/bin/java" -version >/dev/null 2>&1; then
  export JAVA_HOME=/opt/homebrew/opt/openjdk@21
fi
SDK=${ANDROID_HOME:-${ANDROID_SDK_ROOT:-$HOME/Library/Android/sdk}}
ADB=${ADB:-$(command -v adb || echo "$SDK/platform-tools/adb")}
EMULATOR="$SDK/emulator/emulator"
PKG=com.unified.health.debug
REPORT="$ROOT/build/e2e-report"
ADDITIONAL="$ROOT/app/build/outputs/connected_android_test_additional_output/debugAndroidTest/connected"
JUNIT="$ROOT/app/build/outputs/androidTest-results/connected"

log() { printf '\n\033[1m== %s\033[0m\n' "$*"; }

pick_serial() {
  local wanted=${1:-${ANDROID_SERIAL:-}}
  if [[ -n "$wanted" ]]; then
    "$ADB" -s "$wanted" get-state >/dev/null 2>&1 && echo "$wanted"
    return
  fi
  "$ADB" devices | awk 'NR>1 && $2=="device" {print $1; exit}'
}

boot_avd() {
  [[ -x "$EMULATOR" ]] || return 1
  local avd=${E2E_AVD:-$("$EMULATOR" -list-avds | head -1)}
  [[ -n "$avd" ]] || return 1
  log "No device attached: booting AVD '$avd' headless"
  nohup "$EMULATOR" -avd "$avd" -no-window -no-audio -no-boot-anim -no-snapshot-save -gpu swiftshader_indirect \
    >"$ROOT/build/e2e-emulator.log" 2>&1 &
  for _ in $(seq 1 120); do
    sleep 3
    local s; s=$("$ADB" devices | awk 'NR>1 && $2=="device" {print $1; exit}')
    if [[ -n "$s" && "$("$ADB" -s "$s" shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')" == "1" ]]; then
      echo "$s"; return 0
    fi
  done
  return 1
}

mkdir -p "$ROOT/build"
SERIAL=$(pick_serial "${1:-}")
[[ -z "$SERIAL" ]] && SERIAL=$(boot_avd || true)

if [[ "${E2E_SKIP_UNIT:-0}" != "1" ]]; then
  log "JVM unit tests"
  ./gradlew --max-workers=${E2E_GRADLE_WORKERS:-4} testDebugUnitTest :core:domain:test --console=plain -q || UNIT_FAILED=1
fi

rm -rf "$REPORT"; mkdir -p "$REPORT"

if [[ -z "$SERIAL" ]]; then
  log "No emulator/device available: report without instrumented flows"
  python3 scripts/e2e_report.py "$REPORT" --no-device \
    --junit "$ROOT/core" --junit "$ROOT/app/build/test-results" --junit "$ROOT/feature"
  echo "Report: $REPORT/index.html"
  exit 2
fi

export ANDROID_SERIAL=$SERIAL
AVD_NAME=$("$ADB" -s "$SERIAL" emu avd name 2>/dev/null | head -1 | tr -d '\r' || true)
log "Device $SERIAL ${AVD_NAME:+(AVD $AVD_NAME)}"

log "Build app + test APKs"
./gradlew --max-workers=${E2E_GRADLE_WORKERS:-4} assembleDebug assembleDebugAndroidTest --console=plain -q || { echo "build failed"; exit 1; }

log "Fresh install state (permissions and data reset)"
"$ADB" -s "$SERIAL" uninstall "$PKG" >/dev/null 2>&1 || true
"$ADB" -s "$SERIAL" uninstall "$PKG.test" >/dev/null 2>&1 || true
"$ADB" -s "$SERIAL" shell rm -rf /sdcard/googletest/test_outputfiles/e2e-report >/dev/null 2>&1 || true
"$ADB" -s "$SERIAL" shell input keyevent KEYCODE_WAKEUP >/dev/null 2>&1 || true
"$ADB" -s "$SERIAL" shell wm dismiss-keyguard >/dev/null 2>&1 || true

log "Run instrumented flows (install → onboarding → pair mock watch → sync → seed → charts → unpair)"
./gradlew --max-workers=${E2E_GRADLE_WORKERS:-4} :app:connectedDebugAndroidTest --console=plain
TESTS=$?

log "Collect screenshots"
src=$(find "$ADDITIONAL" -type d -name e2e-report 2>/dev/null | head -1)
if [[ -n "$src" ]]; then
  cp -R "$src"/. "$REPORT"/
else
  "$ADB" -s "$SERIAL" pull /sdcard/googletest/test_outputfiles/e2e-report/. "$REPORT"/ >/dev/null || true
fi

log "Build report"
python3 scripts/e2e_report.py "$REPORT" --junit "$JUNIT" --serial "$SERIAL" ${AVD_NAME:+--avd "$AVD_NAME"}
echo
echo "Report: $REPORT/index.html"
echo "Instrumented tests: $([[ $TESTS -eq 0 ]] && echo PASSED || echo FAILED)  ·  JVM unit tests: $([[ -z "${UNIT_FAILED:-}" ]] && echo PASSED || echo FAILED)"
[[ $TESTS -eq 0 && -z "${UNIT_FAILED:-}" ]]
