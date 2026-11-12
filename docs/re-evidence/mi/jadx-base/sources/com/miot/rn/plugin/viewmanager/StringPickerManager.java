package com.miot.rn.plugin.viewmanager;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.miot.rn.plugin.viewmanager.view.StringPicker;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.common.util.DisplayUtils;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.iej;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class StringPickerManager extends SimpleViewManager {
    private static String REACT_CLASS = "MHStringPicker";
    private static final String TAG = "StringPickerManager";

    public class a extends StringPicker {
        public String D0;
        public String[] E0;
        public String F0;
        public String G0;
        public StringPicker.i H0;

        /* JADX INFO: renamed from: com.miot.rn.plugin.viewmanager.StringPickerManager$a$a, reason: collision with other inner class name */
        public class C0320a implements StringPicker.i {
            public C0320a() {
            }

            @Override // com.miot.rn.plugin.viewmanager.view.StringPicker.i
            public void a(StringPicker stringPicker, int i, int i2) {
                a aVar = (a) stringPicker;
                RnPluginLog.i("MHStringPicker  onChangeStart...oldIndex=" + i + "  newIndex=" + i2);
                ((RCTEventEmitter) ((ReactContext) aVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(aVar.getId(), "onChangeStart", Arguments.createMap());
            }

            @Override // com.miot.rn.plugin.viewmanager.view.StringPicker.i
            public void b(StringPicker stringPicker, int i, int i2) {
                a aVar = (a) stringPicker;
                String strP0 = aVar.p0(i);
                String strP1 = aVar.p0(i2);
                RnPluginLog.i("MHStringPicker  onLastValueChange...  oldValue=" + strP0 + "  newIndex=" + i2 + "  newValue=" + strP1);
                ReactContext reactContext = (ReactContext) aVar.getContext();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("oldValue", strP0);
                writableMapCreateMap.putString("newValue", strP1);
                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(aVar.getId(), "onValueChanged", writableMapCreateMap);
                StringPickerManager.super.setAccessibilityLabel(aVar, a.this.G0 + " " + strP1 + " " + aVar.getUnit());
            }

            @Override // com.miot.rn.plugin.viewmanager.view.StringPicker.i
            public void c(StringPicker stringPicker, int i, int i2) {
                RnPluginLog.i("MHStringPicker  onValueChange...   newIndex=" + i2);
                a aVar = (a) stringPicker;
                String strP0 = aVar.p0(i);
                String strP1 = aVar.p0(i2);
                RnPluginLog.i("MHStringPicker  onLastValueChange...  oldValue=" + strP0 + "  newIndex=" + i2 + "  newValue=" + strP1);
                ReactContext reactContext = (ReactContext) aVar.getContext();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("oldValue", strP0);
                writableMapCreateMap.putString("newValue", strP1);
                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(aVar.getId(), "onValueFastChanged", writableMapCreateMap);
            }
        }

        public a(Context context) {
            super(context);
            this.D0 = "";
            this.E0 = null;
            this.G0 = "";
            this.H0 = new C0320a();
        }

        public final String p0(int i) {
            if (i < 0) {
                RnPluginLog.e("StringPickerNanager   index is smaller than 0");
                return "";
            }
            String[] strArr = this.E0;
            if (strArr != null && strArr.length > 0 && strArr.length > i) {
                return strArr[i];
            }
            RnPluginLog.e("StringPickerNanager  dataSource is null");
            return "";
        }

        public final void q0() {
            this.O = false;
        }

        public void r0(String str) {
            int i;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                i = Integer.parseInt(str);
            } catch (Exception e) {
                RnPluginLog.e("MHStringPicker  " + e.toString());
                i = -7829368;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(0.5f);
            this.d0 = paint;
        }

        public final void s0() {
            String[] strArr = this.E0;
            if (strArr == null || strArr.length == 0) {
                return;
            }
            q0();
            r0(this.F0);
            d0(0, this.E0.length - 1, 0);
            setDisplayedValues(this.E0);
            setMinValue(0);
            setMaxValue(this.E0.length - 1);
            int i = 0;
            while (true) {
                String[] strArr2 = this.E0;
                if (i >= strArr2.length) {
                    i = 0;
                    break;
                } else if (this.D0.equalsIgnoreCase(strArr2[i])) {
                    break;
                } else {
                    i++;
                }
            }
            setValue(i);
            t0();
            setWrapSelectorWheel(false);
        }

        public final void t0() {
            String str = "";
            int i = 0;
            while (true) {
                String[] strArr = this.E0;
                if (i >= strArr.length) {
                    this.o0 = N(str);
                    return;
                } else {
                    if (strArr[i].length() > str.length()) {
                        str = this.E0[i];
                    }
                    i++;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, View view) {
        if (view instanceof a) {
            RnPluginLog.i("MHStringPicker addEventEmitters...");
            a aVar = (a) view;
            aVar.setOnValueChangedListener(aVar.H0);
        }
        super.addEventEmitters(g9pVar, view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return e4f.a().b("onValueChanged", e4f.d("registrationName", "onValueChanged")).b("onChangeStart", e4f.d("registrationName", "onChangeStart")).b("onValueFastChanged", e4f.d("registrationName", "onValueFastChanged")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(View view) {
        RnPluginLog.i("MHStringPicker  onAfterUpdateTransaction...");
        if (view != null && (view instanceof a)) {
            ((a) view).s0();
        }
        super.onAfterUpdateTransaction(view);
    }

    @iej(name = "accessibilityLabel")
    public void setAccessibilityLabel(a aVar, String str) {
        aVar.G0 = str;
        super.setAccessibilityLabel(aVar, str + " " + aVar.D0 + " " + aVar.getUnit());
    }

    @iej(name = "accessible")
    public void setAccessible(a aVar, boolean z) {
        aVar.setFocusable(z);
    }

    @iej(name = EcgReportKey.dataSource)
    public void setDataSource(a aVar, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        int size = readableArray.size();
        aVar.E0 = new String[size];
        for (int i = 0; i < size; i++) {
            aVar.E0[i] = readableArray.getString(i);
        }
    }

    @iej(name = "defaultValue")
    public void setDefaultValue(a aVar, String str) {
        aVar.D0 = str;
        setAccessibilityLabel(aVar, aVar.G0);
    }

    @iej(name = "fontSize")
    public void setFontSize(a aVar, int i) {
        aVar.setUnSelectTextSize(DisplayUtils.sp2px(aVar.getContext(), i));
    }

    @iej(customType = "Color", name = "lineColor")
    public void setLineColor(a aVar, int i) {
        aVar.F0 = "" + i;
    }

    @iej(customType = "Color", name = "selectBgColor")
    public void setSelectBgColor(a aVar, int i) {
        aVar.setSelectItemBgColor(i);
    }

    @iej(name = "selectFontSize")
    public void setSelectFontSize(a aVar, int i) {
        aVar.setSelectTextSize(DisplayUtils.sp2px(aVar.getContext(), i));
    }

    @iej(customType = "Color", name = "selectTextColor")
    public void setSelectTextColor(a aVar, int i) {
        aVar.setSelectTextColor(i);
    }

    @iej(customType = "Color", name = "textColor")
    public void setTextColor(a aVar, int i) {
        aVar.setUnSelectTextColor(i);
    }

    @iej(name = "unit")
    public void setUnit(a aVar, String str) {
        aVar.setUnit(str);
        setAccessibilityLabel(aVar, aVar.G0);
    }

    @iej(name = "unitFontSize")
    public void setUnitFontSize(a aVar, int i) {
        aVar.setUnitFontSize(DisplayUtils.sp2px(aVar.getContext(), i));
    }

    @iej(customType = "Color", name = "unitTextColor")
    public void setUnitTextColor(a aVar, int i) {
        aVar.setUnitTextColor(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(g9p g9pVar) {
        a aVar = new a(g9pVar);
        aVar.setPickerType((short) 1);
        aVar.setFocusable(true);
        return aVar;
    }
}
