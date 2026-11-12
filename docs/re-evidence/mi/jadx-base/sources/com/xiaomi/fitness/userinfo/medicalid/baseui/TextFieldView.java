package com.xiaomi.fitness.userinfo.medicalid.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a5j;
import defpackage.hsi;
import defpackage.nvi;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/baseui/TextFieldView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initView", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldView extends LinearLayout {
    public TextFieldView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(nvi.I, this);
        initView(attributeSet);
        setGravity(16);
    }

    private final void initView(AttributeSet attrs) {
        TypedArray typedArrayObtainAttributes = getContext().getResources().obtainAttributes(attrs, a5j.V4);
        ((TextView) findViewById(hsi.C1)).setText(typedArrayObtainAttributes.getString(a5j.W4));
        typedArrayObtainAttributes.recycle();
    }

    public TextFieldView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(nvi.I, this);
        initView(attributeSet);
        setGravity(16);
    }
}
