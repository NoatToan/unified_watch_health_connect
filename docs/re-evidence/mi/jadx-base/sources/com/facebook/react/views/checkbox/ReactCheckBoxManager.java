package com.facebook.react.views.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.g9p;
import defpackage.iej;
import defpackage.ocj;
import defpackage.pcj;
import defpackage.ua4;
import defpackage.ufp;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes4.dex */
public class ReactCheckBoxManager extends SimpleViewManager<ocj> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    private static final String REACT_CLASS = "AndroidCheckBox";

    public class a implements CompoundButton.OnCheckedChangeListener {
        public final ReactContext a(CompoundButton compoundButton) {
            Context context = compoundButton.getContext();
            return context instanceof ufp ? (ReactContext) ((ufp) context).getBaseContext() : (ReactContext) compoundButton.getContext();
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((UIManagerModule) a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new pcj(compoundButton.getId(), z));
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static int getThemeColor(Context context, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(getIdentifier(context, str), typedValue, true);
        return typedValue.data;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @iej(defaultBoolean = true, name = "enabled")
    public void setEnabled(ocj ocjVar, boolean z) {
        ocjVar.setEnabled(z);
    }

    @iej(name = DebugKt.DEBUG_PROPERTY_VALUE_ON)
    public void setOn(ocj ocjVar, boolean z) {
        ocjVar.setOnCheckedChangeListener(null);
        ocjVar.b(z);
        ocjVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @iej(name = "tintColors")
    public void setTintColors(ocj ocjVar, ReadableMap readableMap) {
        ua4.c(ocjVar, new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{(readableMap == null || !readableMap.hasKey("true")) ? getThemeColor(ocjVar.getContext(), "colorAccent") : readableMap.getInt("true"), (readableMap == null || !readableMap.hasKey("false")) ? getThemeColor(ocjVar.getContext(), "colorPrimaryDark") : readableMap.getInt("false")}));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, ocj ocjVar) {
        ocjVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ocj createViewInstance(g9p g9pVar) {
        return new ocj(g9pVar);
    }
}
