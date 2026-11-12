package com.garmin.analytics.omt.eventValidators;

import com.garmin.analytics.EventValidationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zk.a;
import zk.e;
import zk.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/analytics/omt/eventValidators/OmtEventValidator;", "Lzk/g;", "", "", "eventTypes", "<init>", "(Ljava/util/List;)V", "OmtEventValidationException", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OmtEventValidator implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f28614a;

    public OmtEventValidator(List<String> list) {
        list.getClass();
        this.f28614a = list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zk.g
    public final boolean a(a aVar) throws OmtEventValidationException {
        aVar.getClass();
        String str = aVar.f205029a;
        List<e> list = aVar.f205030b;
        int i14 = 2;
        Exception exc = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (list.isEmpty()) {
            throw new OmtEventValidationException("empty parameter list", objArr2 == true ? 1 : 0, i14, objArr == true ? 1 : 0);
        }
        jc2.a[] aVarArrValues = jc2.a.values();
        ArrayList arrayList = new ArrayList(aVarArrValues.length);
        for (jc2.a aVar2 : aVarArrValues) {
            arrayList.add(aVar2.omtEventTypeValue);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (s.g((String) it.next(), str)) {
                    for (Object obj : list) {
                        if (((e) obj).f205040a.equals("UnitInfo")) {
                            if (obj != null) {
                                return true;
                            }
                            throw new OmtEventValidationException("parameter [UnitInfo] missing", exc, i14, objArr3 == true ? 1 : 0);
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        return true;
                    }
                    throw new OmtEventValidationException("parameter [UnitInfo] missing", exc, i14, objArr3 == true ? 1 : 0);
                }
            }
        }
        List<String> list2 = this.f28614a;
        if (!list2.isEmpty()) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (s.g((String) it3.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/analytics/omt/eventValidators/OmtEventValidator$OmtEventValidationException;", "Lcom/garmin/analytics/EventValidationException;", "message", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OmtEventValidationException extends EventValidationException {
        public /* synthetic */ OmtEventValidationException(String str, Exception exc, int i14, j jVar) {
            this(str, (i14 & 2) != 0 ? null : exc);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OmtEventValidationException(String str, Exception exc) {
            super(str, exc);
            str.getClass();
        }
    }
}
