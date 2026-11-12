package com.google.firebase.messaging;

import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.protobuf.DescriptorProtos;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Transformer, SuccessContinuation, ObjectConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53775a;

    public /* synthetic */ l(int i14) {
        this.f53775a = i14;
    }

    public static Object a(int i14) {
        return DescriptorProtos.getDescriptor().getMessageTypes().get(i14);
    }

    public static ArrayList b(int i14, HashMap map, ArrayList arrayList, int i15, String str) {
        map.put(Integer.valueOf(i14), arrayList);
        ArrayList arrayList2 = new ArrayList(i15);
        arrayList2.add(str);
        return arrayList2;
    }

    public static /* synthetic */ void c(double d14, String str) {
        throw new IllegalArgumentException(str + d14);
    }

    public static /* synthetic */ void d(float f14, String str) {
        throw new IllegalArgumentException(str + f14);
    }

    public static /* synthetic */ void e(int i14, int i15) {
        throw new IllegalArgumentException("Length too large: " + i14 + i15);
    }

    public static /* synthetic */ void f(int i14, Object obj) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append((Object) "#read(byte[]) returned invalid result: ");
        sb3.append(i14);
        sb3.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb3.toString());
    }

    public static /* synthetic */ void g(int i14, Object obj, Object obj2, Object obj3, int i15) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        sb3.append(i14);
        sb3.append(obj3);
        sb3.append(i15);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ void h(Object obj, int i14, int i15, String str) {
        throw new IllegalArgumentException(str + i14 + obj + i15);
    }

    public static /* synthetic */ void i(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalStateException(sb3.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new NumberFormatException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Throwable th3) {
        throw new RuntimeException(str + obj + obj2, th3);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void p(Object obj, String str) throws EOFException {
        throw new EOFException(str + obj);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.f53775a) {
            case 0:
                return ((MessagingClientEventExtension) obj).toByteArray();
            default:
                return ((PerfMetric) obj).toByteArray();
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f53775a) {
            case 11:
                return ConstructorConstructor.lambda$newCollectionConstructor$13();
            case 12:
                return ConstructorConstructor.lambda$newMapConstructor$14();
            case 13:
                return ConstructorConstructor.lambda$newMapConstructor$15();
            case 14:
                return ConstructorConstructor.lambda$newMapConstructor$16();
            case 15:
                return ConstructorConstructor.lambda$newMapConstructor$17();
            case 16:
                return ConstructorConstructor.lambda$newMapConstructor$18();
            case 17:
                return ConstructorConstructor.lambda$newCollectionConstructor$10();
            case 18:
                return ConstructorConstructor.lambda$newCollectionConstructor$11();
            default:
                return ConstructorConstructor.lambda$newCollectionConstructor$12();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f53775a) {
            case 2:
                return FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
            case 3:
                return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
            default:
                return FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
        }
    }
}
