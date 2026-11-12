package com.facebook.react.views.picker;

import defpackage.g9p;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactDialogPickerManager.REACT_CLASS)
public class ReactDialogPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDialogPicker";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactPicker createViewInstance(g9p g9pVar) {
        return new ReactPicker(g9pVar, 0);
    }
}
