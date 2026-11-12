package kq2;

import c83.a0;
import c83.d;
import i83.f;
import i83.s;
import jq2.c;
import p005kotlin.Metadata;
import q03.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lkq2/a;", "", "", "cardType", "Lc83/d;", "Ljq2/c;", "a", "(Ljava/lang/String;)Lc83/d;", "Lq03/r;", "Lc83/a0;", "b", "(Ljava/lang/String;)Lq03/r;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("com.garmin.connect.mobile/garmin-pay/{card_type}_transaction_mapping_zh-tw.json")
    d<c> a(@s("card_type") String cardType);

    @f("com.garmin.connect.mobile/garmin-pay/{card_type}_transaction_mapping_zh-tw.json")
    r<a0<c>> b(@s("card_type") String cardType);
}
