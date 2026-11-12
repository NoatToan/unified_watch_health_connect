package com.xiaomi.fitness.electronic.scale.widget;

import android.util.ArrayMap;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.SingleChoiceDialog;
import defpackage.bri;

/* JADX INFO: loaded from: classes8.dex */
public class WeightUnitChoiceDialog extends SingleChoiceDialog {

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, WeightUnitChoiceDialog> {
        public a(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeightUnitChoiceDialog internalCreate() {
            return new WeightUnitChoiceDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    @Override // com.xiaomi.fitness.baseui.widget.SingleChoiceDialog
    public void B() {
        if (this.f11716a == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f11716a = arrayMap;
            arrayMap.put(Integer.valueOf(bri.V2), 0);
            this.f11716a.put(Integer.valueOf(bri.W2), 1);
            this.f11716a.put(Integer.valueOf(bri.X2), 2);
        }
        if (this.f11717b == null) {
            ArrayMap arrayMap2 = new ArrayMap();
            this.f11717b = arrayMap2;
            arrayMap2.put(0, Integer.valueOf(bri.V2));
            this.f11717b.put(1, Integer.valueOf(bri.W2));
            this.f11717b.put(2, Integer.valueOf(bri.X2));
        }
    }
}
