package defpackage;

import com.huawei.ads.adsrec.IUtilCallback;
import com.huawei.ads.adsrec.l;
import com.huawei.ads.adsrec.o0;
import com.huawei.ads.adsrec.rank.sortation.IModelScoreData;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class axx extends l {
    private ayc g;
    IUtilCallback i;
    public static final String[] e = {Constants.RELATION_COL_A_KEY, "ad_score", "ad_intent_score", "ad_merge_score"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f767b = {"dsp_id"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f768c = {"interaction_type", "industry_id_1st", "media_type", "ad_type"};
    public static final String[] d = {"req_intent_id_1st", "day_intent_id_1st"};

    class d implements Comparator<axh> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(axh axhVar, axh axhVar2) {
            return o0.a(axhVar, axhVar2, (axhVar.w().booleanValue() && axhVar2.w().booleanValue()) ? o0.a(axhVar2.s(), axhVar.s()) : o0.a(axhVar, axhVar2));
        }

        d() {
        }
    }

    @Override // com.huawei.ads.adsrec.h0
    public void a() {
        if (this.i == null || ListUtil.isEmpty(this.f4757a) || this.f4757a.size() == 1) {
            return;
        }
        IModelScoreData iModelScoreDataA = this.g.a();
        if (iModelScoreDataA != null) {
            for (axh axhVar : this.f4757a) {
                iModelScoreDataA.setModelScore(axhVar);
                axhVar.i();
                axhVar.s();
            }
        } else {
            HiAdLog.w("ModelSortation", "modelScoreData is still null!");
        }
        Collections.sort(this.f4757a, new d());
        if (HiAdLog.isDebugEnable()) {
            for (axh axhVar2 : this.f4757a) {
                axhVar2.i();
                axhVar2.s();
            }
        }
    }

    public axx(List<axh> list, ayc aycVar) {
        super(list);
        this.i = awz.c();
        this.g = aycVar;
    }
}
