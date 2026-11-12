package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import defpackage.ewh;
import defpackage.g9p;
import defpackage.gej;
import defpackage.iej;
import defpackage.pd8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReactPickerManager extends SimpleViewManager<ReactPicker> {

    public static class a implements ReactPicker.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReactPicker f7533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pd8 f7534b;

        public a(ReactPicker reactPicker, pd8 pd8Var) {
            this.f7533a = reactPicker;
            this.f7534b = pd8Var;
        }

        @Override // com.facebook.react.views.picker.ReactPicker.c
        public void a(int i) {
            this.f7534b.dispatchEvent(new ewh(this.f7533a.getId(), i));
        }
    }

    @iej(customType = "Color", name = "color")
    public void setColor(ReactPicker reactPicker, Integer num) {
        reactPicker.setStagedPrimaryTextColor(num);
    }

    @iej(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactPicker reactPicker, boolean z) {
        reactPicker.setEnabled(z);
    }

    @iej(name = "items")
    public void setItems(ReactPicker reactPicker, ReadableArray readableArray) {
        reactPicker.setStagedItems(gej.a(readableArray));
    }

    @iej(name = ThirdPartAccessConstants.KEY_PROMPT)
    public void setPrompt(ReactPicker reactPicker, String str) {
        reactPicker.setPrompt(str);
    }

    @iej(name = "selected")
    public void setSelected(ReactPicker reactPicker, int i) {
        reactPicker.setStagedSelection(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(g9p g9pVar, ReactPicker reactPicker) {
        reactPicker.setOnSelectListener(new a(reactPicker, ((UIManagerModule) g9pVar.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactPicker reactPicker) {
        super.onAfterUpdateTransaction(reactPicker);
        reactPicker.d();
    }
}
