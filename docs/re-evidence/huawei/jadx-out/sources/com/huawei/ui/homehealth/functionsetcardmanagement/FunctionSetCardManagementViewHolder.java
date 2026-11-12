package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.homeinterface.OnStartDragListener;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.skw;
import defpackage.tfh;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnStartDragListener f25511a;
    private ImageView d;
    private final HealthTextView e;

    FunctionSetCardManagementViewHolder(View view, Context context, boolean z, OnStartDragListener onStartDragListener) {
        super(view, context, z);
        this.e = (HealthTextView) view.findViewById(R.id.itemText);
        ImageView imageView = (ImageView) view.findViewById(R.id.itemhandle);
        this.f25511a = onStartDragListener;
        this.d = (ImageView) view.findViewById(R.id.itemDelete);
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewHolder.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (FunctionSetCardManagementViewHolder.this.f25511a != null && MotionEventCompat.getActionMasked(motionEvent) == 0) {
                    FunctionSetCardManagementViewHolder.this.f25511a.onStartDrag(FunctionSetCardManagementViewHolder.this);
                }
                return false;
            }
        });
    }

    public void d(skw skwVar) {
        tfh.c(skwVar, this.e);
    }

    public ImageView c() {
        return this.d;
    }
}
