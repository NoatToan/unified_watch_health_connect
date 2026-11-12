package com.airbnb.lottie.parser.moshi;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    public static StringBuilder a(String str, double d14, String str2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(d14);
        sb3.append(str2);
        return sb3;
    }

    public static /* synthetic */ void b(StringBuilder sb3, Object obj, Object obj2) {
        sb3.append(obj);
        sb3.append(obj2);
        throw new JsonDataException(sb3.toString());
    }
}
