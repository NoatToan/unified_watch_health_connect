package com.garmin.android.apps.connectmobile.social.share.ui;

import android.view.MotionEvent;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/a;", "", "Lcom/garmin/android/apps/connectmobile/social/share/ui/a$a;", "mListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/social/share/ui/a$a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0848a f44724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44725b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f44726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44727d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.share.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0848a {
        void g(a aVar);
    }

    public a(InterfaceC0848a interfaceC0848a) {
        this.f44724a = interfaceC0848a;
    }

    public final float a(MotionEvent motionEvent) {
        ArrayList arrayList = this.f44725b;
        return (float) Math.toDegrees(Math.atan2(((double) motionEvent.getY(motionEvent.findPointerIndex(((Number) arrayList.get(1)).intValue()))) - ((double) motionEvent.getY(motionEvent.findPointerIndex(((Number) arrayList.get(0)).intValue()))), ((double) motionEvent.getX(motionEvent.findPointerIndex(((Number) arrayList.get(1)).intValue()))) - motionEvent.getX(motionEvent.findPointerIndex(((Number) arrayList.get(0)).intValue()))));
    }

    public final void b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f44725b;
        if (actionMasked == 0) {
            if (!arrayList.isEmpty()) {
                arrayList.clear();
            }
            arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (arrayList.size() >= 2) {
                    float fA = a(motionEvent);
                    this.f44727d = fA - this.f44726c;
                    this.f44726c = fA;
                    InterfaceC0848a interfaceC0848a = this.f44724a;
                    if (interfaceC0848a != null) {
                        interfaceC0848a.g(this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                    this.f44726c = a(motionEvent);
                    return;
                } else {
                    if (actionMasked != 6) {
                        return;
                    }
                    arrayList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                    return;
                }
            }
        }
        arrayList.clear();
    }
}
