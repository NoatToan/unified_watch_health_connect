package com.xmlywind.sdk.base.common;

import android.content.Context;
import android.os.Bundle;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.models.SigmobError;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public abstract class r extends k {
    public String a;
    public k.b b;
    public BaseAdUnit c;
    public String d;
    private EventForwardingBroadcastReceiver e;

    public r(k.b bVar) {
        this.b = null;
        this.b = bVar;
    }

    public abstract void a(Context context, k.b bVar);

    public void a(Context context, BaseAdUnit baseAdUnit, Bundle bundle) {
        EventForwardingBroadcastReceiver eventForwardingBroadcastReceiver = new EventForwardingBroadcastReceiver(baseAdUnit, this.b, this.a);
        this.e = eventForwardingBroadcastReceiver;
        eventForwardingBroadcastReceiver.a(eventForwardingBroadcastReceiver, context);
    }

    public void a(Context context, Map<String, Object> map, BaseAdUnit baseAdUnit) {
        if (b(baseAdUnit)) {
            this.c = baseAdUnit;
            SigmobLog.d("baseAdUnitValid success");
            try {
                this.a = baseAdUnit.getUuid();
                a(context, this.b);
                return;
            } catch (ClassCastException unused) {
                SigmobLog.e("LocalExtras contained an incorrect type.");
            }
        }
        this.b.a(baseAdUnit, SigmobError.ERROR_SIGMOB_INFORMATION_LOSE.toString());
    }

    public void a(String str) {
        this.d = str;
    }

    public abstract boolean b(BaseAdUnit baseAdUnit);

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
    public void c(BaseAdUnit baseAdUnit) {
        EventForwardingBroadcastReceiver eventForwardingBroadcastReceiver = this.e;
        if (eventForwardingBroadcastReceiver != null) {
            eventForwardingBroadcastReceiver.a(eventForwardingBroadcastReceiver);
        }
    }
}
