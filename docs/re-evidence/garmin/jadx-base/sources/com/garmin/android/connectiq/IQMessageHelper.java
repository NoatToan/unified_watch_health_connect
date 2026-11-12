package com.garmin.android.connectiq;

import java.util.ArrayList;
import java.util.HashMap;
import p005kotlin.Metadata;
import vt2.d;
import vt2.i;
import vt2.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/connectiq/IQMessageHelper;", "", "<init>", "()V", "Lvt2/n;", "object", "convertToJava", "(Lvt2/n;)Ljava/lang/Object;", "", "INVALID_APP_VERSION", "I", "connectiq-companion-app-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IQMessageHelper {
    public static final IQMessageHelper INSTANCE = new IQMessageHelper();
    public static final int INVALID_APP_VERSION = 65535;

    private IQMessageHelper() {
    }

    public final Object convertToJava(n<?> object) {
        object.getClass();
        byte b14 = object.f180206a;
        if (b14 == 0) {
            return null;
        }
        if (b14 == 1 || b14 == 14 || b14 == 2 || b14 == 15 || b14 == 3 || b14 == 9 || b14 == 19) {
            return object.e();
        }
        if (b14 == 5) {
            ArrayList<n<?>> arrayList = ((vt2.b) object).f180193b;
            ArrayList arrayList2 = new ArrayList();
            for (n<?> nVar : arrayList) {
                nVar.getClass();
                arrayList2.add(convertToJava(nVar));
            }
            return arrayList2;
        }
        if (b14 != 11) {
            if (b14 == 20) {
                return new ArrayList(((d) object).f180196b);
            }
            return null;
        }
        HashMap<n<?>, n<?>> map = ((i) object).f180200b;
        HashMap map2 = new HashMap();
        for (n<?> nVar2 : map.keySet()) {
            nVar2.getClass();
            Object objConvertToJava = convertToJava(nVar2);
            n<?> nVar3 = map.get(nVar2);
            nVar3.getClass();
            map2.put(objConvertToJava, convertToJava(nVar3));
        }
        return map2;
    }
}
