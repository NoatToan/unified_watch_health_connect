package com.google.android.material.color.utilities;

import com.garmin.android.library.mapsdkadapter.s;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.text.lookup.StringLookupFactory;
import po.h;
import ps.i;
import ps.x1;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53202a;

    public /* synthetic */ f(int i14) {
        this.f53202a = i14;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f53202a) {
            case 0:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
            case 1:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 2:
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 3:
                return ConcurrentHashMap.newKeySet();
            case 4:
                return ((Rule.Phoneme) obj).getPhonemeText();
            case 5:
                return Rule.lambda$parseRules$4((String) obj);
            case 6:
                return ((Field) obj).getName();
            case 7:
                return ((Class) obj).getDeclaredMethods();
            case 8:
                return Arrays.stream((Method[]) obj);
            case 9:
                return String.valueOf((Class) obj);
            case 10:
                return ((Method) obj).toString();
            case 11:
                return MethodUtils.lambda$null$3((Integer) obj);
            case 12:
                return StringLookupFactory.lambda$static$0((String) obj);
            case 13:
                return StringLookupFactory.lambda$static$1((String) obj);
            case 14:
                return System.getenv((String) obj);
            case 15:
                return StringLookupFactory.lambda$static$2((String) obj);
            case 16:
                return System.getProperty((String) obj);
            case 17:
                i iVar = (i) obj;
                int i14 = h.E1;
                return new s(new com.garmin.android.library.mapsdkadapter.f(iVar.getLat(), iVar.getLon(), com.garmin.android.library.mapsdkadapter.i.b.WGS84), iVar.getWeight());
            default:
                return ((x1) obj).getStartDateTime();
        }
    }
}
