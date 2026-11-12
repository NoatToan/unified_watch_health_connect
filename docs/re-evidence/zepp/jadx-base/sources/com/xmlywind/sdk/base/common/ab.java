package com.xmlywind.sdk.base.common;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.xmlywind.sdk.base.models.BaseAdUnit;

/* JADX INFO: loaded from: classes22.dex */
public class ab extends GestureDetector {
    private final View a;
    private b b;

    private ab(Context context, View view, b bVar) {
        super(context, bVar);
        this.b = bVar;
        this.a = view;
        setIsLongpressEnabled(false);
    }

    public ab(Context context, View view, BaseAdUnit baseAdUnit) {
        this(context, view, new b(view, baseAdUnit));
    }

    private boolean a(MotionEvent motionEvent, View view) {
        if (motionEvent != null && view != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= 0.0f && x <= view.getWidth() && y >= 0.0f && y <= view.getHeight()) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.b.b();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1) {
            this.b.a();
        } else if (action == 2 && !a(motionEvent, this.a)) {
            a();
        }
        return zOnTouchEvent;
    }
}
