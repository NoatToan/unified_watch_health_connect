package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import defpackage.bdo;
import defpackage.d8p;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.h8p;
import defpackage.m7p;
import defpackage.ndj;
import defpackage.o0d;
import defpackage.tfj;
import defpackage.ufj;
import defpackage.yej;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ReactTextViewManager.REACT_CLASS)
public class ReactTextViewManager extends ReactTextAnchorViewManager<ReactTextView, tfj> implements o0d {
    public static final String REACT_CLASS = "RCTText";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return e4f.e("topTextLayout", e4f.d("registrationName", "onTextLayout"), "topInlineViewLayout", e4f.d("registrationName", "onInlineViewLayout"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<tfj> getShadowNodeClass() {
        return tfj.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return h8p.d(context, readableMap, readableMap2, f, yogaMeasureMode, f2, yogaMeasureMode2);
    }

    @Override // defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public tfj createShadowNodeInstance() {
        return new tfj();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactTextView createViewInstance(g9p g9pVar) {
        return new ReactTextView(g9pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactTextView reactTextView) {
        super.onAfterUpdateTransaction(reactTextView);
        reactTextView.i();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactTextView reactTextView, Object obj) {
        ufj ufjVar = (ufj) obj;
        if (ufjVar.a()) {
            d8p.g(ufjVar.j(), reactTextView);
        }
        reactTextView.setText(ufjVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactTextView reactTextView, yej yejVar, bdo bdoVar) {
        Spannable spannableC = h8p.c(reactTextView.getContext(), bdoVar.getState().getMap("attributedString"));
        reactTextView.setSpanned(spannableC);
        m7p m7pVar = new m7p(yejVar);
        return new ufj(spannableC, -1, false, m7pVar.h(), m7pVar.j(), m7pVar.d(), m7pVar.b(), 0, 1, 0);
    }
}
