package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.IAdEvent;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class os implements IAdEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.openalliance.ad.inter.data.e f19853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rc f19854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentRecord f19855c;
    private String e;
    private int d = 0;
    private final byte[] f = new byte[0];

    @Override // com.huawei.openalliance.ad.inter.data.IAdEvent
    public void onAdShowed(View view) {
        String str;
        if (this.f19853a == null || this.f19855c == null) {
            str = " ad is not valid";
        } else {
            if (a(view)) {
                synchronized (this.f) {
                    String strValueOf = !TextUtils.isEmpty(this.e) ? this.e : String.valueOf(com.huawei.openalliance.ad.utils.as.c());
                    this.f19853a.h(strValueOf);
                    this.f19855c.c(strValueOf);
                    ContentRecord contentRecord = this.f19855c;
                    int i = this.d + 1;
                    this.d = i;
                    contentRecord.d(i);
                    this.e = null;
                    this.f19854b.b();
                    int iB = b(view);
                    this.f19854b.a(this.f19853a.getMinEffectiveShowTime(), iB);
                    com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
                    String strE = com.huawei.openalliance.ad.utils.dk.e(view);
                    com.huawei.openalliance.ad.inter.data.e eVar = this.f19853a;
                    if (eVar != null) {
                        hw.a("IAdEventProcessor", "slotId: %s, contentId: %s, slot pos: %s", eVar.getSlotId(), this.f19853a.getContentId(), strE);
                    }
                    if (!com.huawei.openalliance.ad.utils.dg.b(strE)) {
                        c0229a.d(strE);
                    }
                    c0229a.a(Long.valueOf(this.f19853a.getMinEffectiveShowTime())).a(Integer.valueOf(iB)).b((Integer) 7).a(com.huawei.openalliance.ad.utils.b.a(view.getContext())).e(vv.b(view)).c((Integer) 0);
                    this.f19854b.a(c0229a.a());
                }
                return;
            }
            str = " ad view is not visible!";
        }
        hw.b("IAdEventProcessor", str);
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAdEvent
    public void onAdClosed(List<String> list) {
        if (this.f19853a == null || this.f19855c == null) {
            hw.b("IAdEventProcessor", "  ad is not valid");
        } else if (a()) {
            this.f19854b.a(0, 0, list);
        }
    }

    private int b(View view) {
        String str;
        if (view == null) {
            str = " ad view is null";
        } else if (view.isShown()) {
            int width = view.getWidth() * view.getHeight();
            if (width <= 0) {
                str = " ad viewArea is zero";
            } else {
                Rect rect = new Rect();
                if (view.getLocalVisibleRect(rect)) {
                    int iWidth = rect.width() * rect.height();
                    if (iWidth > 0) {
                        return (iWidth * 100) / width;
                    }
                    str = " ad view is not visible, visibleArea is zero";
                } else {
                    str = " ad view is not visible";
                }
            }
        } else {
            str = " ad view is not shown";
        }
        hw.b("IAdEventProcessor", str);
        return 0;
    }

    private boolean a(View view) {
        String str;
        if (view == null) {
            str = " ad view is null";
        } else {
            if (view.isShown()) {
                return true;
            }
            str = " ad view is not shown";
        }
        hw.b("IAdEventProcessor", str);
        return false;
    }

    private boolean a() {
        if (this.f19853a == null || this.f19855c == null) {
            hw.b("IAdEventProcessor", "  ad is not valid");
            return false;
        }
        synchronized (this.f) {
            String showId = this.f19853a.getShowId();
            if (TextUtils.isEmpty(showId)) {
                showId = String.valueOf(com.huawei.openalliance.ad.utils.as.c());
            }
            this.e = showId;
            this.f19855c.c(showId);
        }
        return true;
    }

    public os(Context context, com.huawei.openalliance.ad.inter.data.e eVar) {
        this.f19853a = eVar;
        this.f19854b = new pc(context, sw.a(context, eVar.e()));
        ContentRecord contentRecordA = pl.a(eVar);
        this.f19855c = contentRecordA;
        contentRecordA.c(eVar.getShowId());
        this.f19854b.a(this.f19855c);
    }
}
