package lq2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.preload.ui.PreloadTransitManageCardActivity;
import com.google.common.base.Optional;
import d53.w;
import e23.l;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import w2.a0;
import w52.u0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreloadTransitManageCardActivity f114338b;

    public /* synthetic */ a(PreloadTransitManageCardActivity preloadTransitManageCardActivity, int i14) {
        this.f114337a = i14;
        this.f114338b = preloadTransitManageCardActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        List listD0;
        Object dVar;
        switch (this.f114337a) {
            case 0:
                Logger logger = PreloadTransitManageCardActivity.f51738m;
                is2.b bVar = this.f114338b.f51739g;
                if (bVar == null) {
                    s.m("serviceProviderType");
                    throw null;
                }
                logger.info("Transaction resource updated for " + bVar);
                return Unit.INSTANCE;
            default:
                final mq2.b bVar2 = (mq2.b) obj;
                PreloadTransitManageCardActivity.f51738m.debug("Update card details.");
                final c cVar = this.f114338b.f51743k;
                bVar2.getClass();
                Context context = cVar.f114343b;
                String str = bVar2.f120221b;
                List<mq2.c> list = bVar2.f120226g;
                ArrayList arrayList = new ArrayList();
                mq2.a.f120216d.getClass();
                hq2.s sVar = hq2.s.f85278a;
                is2.b bVar3 = bVar2.f120220a;
                sVar.getClass();
                arrayList.add(new c.b.C2178b(new mq2.a(hq2.s.a(bVar3), bVar2.f120224e, bVar2.f120227h)));
                String str2 = bVar2.f120223d;
                if (!w.J(str2)) {
                    arrayList.add(new c.b.a(str2));
                }
                Optional<sd2.f> optional = bVar2.f120222c;
                if (optional.isPresent()) {
                    String string = context.getString(R.string.wallet_card_enabled);
                    string.getClass();
                    arrayList.add(new c.b.e(string));
                    String strT = u0.t(optional.get());
                    if (strT == null) {
                        strT = "";
                    }
                    sd2.f fVar = optional.get();
                    fVar.getClass();
                    arrayList.add(new c.b.C2179c(strT, a0.i(fVar)));
                }
                String string2 = context.getString(R.string.wallet_transactions);
                string2.getClass();
                arrayList.add(new c.b.e(string2));
                if (list.isEmpty()) {
                    String string3 = context.getString(R.string.wallet_no_transactions);
                    string3.getClass();
                    listD0 = p13.w.c(new c.b.d(string3));
                } else {
                    ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new c.b.h((mq2.c) it.next()));
                    }
                    String string4 = context.getString(R.string.wallet_transaction_count_hint);
                    string4.getClass();
                    listD0 = h0.D0(arrayList2, new c.b.i(string4));
                }
                arrayList.addAll(listD0);
                String string5 = context.getString(R.string.wallet_last_topup);
                string5.getClass();
                arrayList.add(new c.b.e(string5));
                mq2.c cVar2 = bVar2.f120225f;
                if (cVar2 != null) {
                    dVar = new c.b.g(cVar2);
                } else {
                    String string6 = context.getString(R.string.wallet_top_up_hint);
                    string6.getClass();
                    dVar = new c.b.d(string6);
                }
                arrayList.add(dVar);
                String string7 = context.getString(R.string.wallet_transit_support);
                string7.getClass();
                arrayList.add(new c.b.e(string7));
                final int i14 = 0;
                arrayList.add(new c.b.f(R.drawable.ic_card_detail_icon_call, e5.g(context.getString(R.string.wallet_call), StringUtils.SPACE, str), new l() { // from class: lq2.b
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i15 = i14;
                        String str3 = "";
                        c cVar3 = cVar;
                        mq2.b bVar4 = bVar2;
                        View view2 = (View) obj2;
                        switch (i15) {
                            case 0:
                                Logger logger2 = c.f114342c;
                                view2.getClass();
                                hq2.s sVar2 = hq2.s.f85278a;
                                is2.b bVar5 = bVar4.f120220a;
                                sVar2.getClass();
                                int i16 = hq2.s.a.f85279a[bVar5.ordinal()];
                                if (i16 == 1) {
                                    str3 = "tel://(02)412-8880";
                                } else if (i16 == 2) {
                                    str3 = "tel://(07)791-2000";
                                }
                                Uri uri = Uri.parse(str3);
                                uri.getClass();
                                cVar3.f114343b.startActivity(new Intent("android.intent.action.DIAL", uri));
                                break;
                            default:
                                Logger logger3 = c.f114342c;
                                view2.getClass();
                                hq2.s sVar3 = hq2.s.f85278a;
                                is2.b bVar6 = bVar4.f120220a;
                                sVar3.getClass();
                                int i17 = hq2.s.a.f85279a[bVar6.ordinal()];
                                if (i17 == 1) {
                                    str3 = "https://support.garmin.com/zh-TW/?faq=aV5kQIQy7c1fzIqEVrW7n9";
                                } else if (i17 == 2) {
                                    str3 = "https://support.garmin.com/zh-TW/?faq=8GIqyMcPb32v55IZ4kt1u5";
                                }
                                Uri uri2 = Uri.parse(str3);
                                uri2.getClass();
                                cVar3.f114343b.startActivity(new Intent("android.intent.action.VIEW", uri2));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                String string8 = context.getString(R.string.wallet_visit_support_faqs, str);
                string8.getClass();
                final int i15 = 1;
                arrayList.add(new c.b.f(R.drawable.ic_card_detail_icon_website, string8, new l() { // from class: lq2.b
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i16 = i15;
                        String str3 = "";
                        c cVar3 = cVar;
                        mq2.b bVar4 = bVar2;
                        View view2 = (View) obj2;
                        switch (i16) {
                            case 0:
                                Logger logger2 = c.f114342c;
                                view2.getClass();
                                hq2.s sVar2 = hq2.s.f85278a;
                                is2.b bVar5 = bVar4.f120220a;
                                sVar2.getClass();
                                int i17 = hq2.s.a.f85279a[bVar5.ordinal()];
                                if (i17 == 1) {
                                    str3 = "tel://(02)412-8880";
                                } else if (i17 == 2) {
                                    str3 = "tel://(07)791-2000";
                                }
                                Uri uri = Uri.parse(str3);
                                uri.getClass();
                                cVar3.f114343b.startActivity(new Intent("android.intent.action.DIAL", uri));
                                break;
                            default:
                                Logger logger3 = c.f114342c;
                                view2.getClass();
                                hq2.s sVar3 = hq2.s.f85278a;
                                is2.b bVar6 = bVar4.f120220a;
                                sVar3.getClass();
                                int i18 = hq2.s.a.f85279a[bVar6.ordinal()];
                                if (i18 == 1) {
                                    str3 = "https://support.garmin.com/zh-TW/?faq=aV5kQIQy7c1fzIqEVrW7n9";
                                } else if (i18 == 2) {
                                    str3 = "https://support.garmin.com/zh-TW/?faq=8GIqyMcPb32v55IZ4kt1u5";
                                }
                                Uri uri2 = Uri.parse(str3);
                                uri2.getClass();
                                cVar3.f114343b.startActivity(new Intent("android.intent.action.VIEW", uri2));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                cVar.t(arrayList);
                return Unit.INSTANCE;
        }
    }
}
