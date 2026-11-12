package com.xmlywind.sdk.rewardVideoAd;

import android.content.Context;
import android.os.Bundle;
import com.xmlywind.sdk.base.common.AdActivity;
import com.xmlywind.sdk.base.common.aa;
import com.xmlywind.sdk.base.common.j;
import com.xmlywind.sdk.base.common.k;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.videoAd.BaseAdActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class f extends aa {
    private RewardVideoAdBroadcastReceiver e;

    public interface a extends k.b {
        void b(BaseAdUnit baseAdUnit, String str);

        void f(BaseAdUnit baseAdUnit);

        void g(BaseAdUnit baseAdUnit);

        void h(BaseAdUnit baseAdUnit);

        void i(BaseAdUnit baseAdUnit);
    }

    public f(k.b bVar) {
        super(bVar);
    }

    @Override // com.xmlywind.sdk.base.common.aa, com.xmlywind.sdk.base.common.r
    public void a(Context context, BaseAdUnit baseAdUnit, Bundle bundle) {
        super.a(context, baseAdUnit, bundle);
        if (this.b instanceof a) {
            RewardVideoAdBroadcastReceiver rewardVideoAdBroadcastReceiver = new RewardVideoAdBroadcastReceiver(baseAdUnit, (a) this.b, this.a);
            this.e = rewardVideoAdBroadcastReceiver;
            rewardVideoAdBroadcastReceiver.a(rewardVideoAdBroadcastReceiver, context);
            this.b.c(baseAdUnit);
        }
        BaseAdActivity.a(context, AdActivity.class, this.a, bundle, ((baseAdUnit.getAd_type() == 1 || baseAdUnit.getAd_type() == 4) && baseAdUnit.getCreativeType() == j.CreativeTypeMRAID.a()) ? "mraid" : "reward");
    }

    @Override // com.xmlywind.sdk.mraid.d, com.xmlywind.sdk.base.common.r
    public void a(Context context, Map<String, Object> map, BaseAdUnit baseAdUnit) {
        super.a(context, map, baseAdUnit);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.xmlywind.sdk.base.common.aa, com.xmlywind.sdk.mraid.d, com.xmlywind.sdk.base.common.r
    public void c(BaseAdUnit baseAdUnit) {
        super.c(baseAdUnit);
        RewardVideoAdBroadcastReceiver rewardVideoAdBroadcastReceiver = this.e;
        if (rewardVideoAdBroadcastReceiver != null) {
            rewardVideoAdBroadcastReceiver.a(rewardVideoAdBroadcastReceiver);
        }
    }
}
