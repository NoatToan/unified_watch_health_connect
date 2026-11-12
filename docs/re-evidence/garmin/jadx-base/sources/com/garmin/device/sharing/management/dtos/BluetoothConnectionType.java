package com.garmin.device.sharing.management.dtos;

import am.j;
import i63.c;
import i63.h;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import m63.k1;
import n63.s;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;", "", "urlParam", "", "connectionType", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getConnectionType", "()I", "getUrlParam", "()Ljava/lang/String;", "LOW_ENERGY", "CLASSIC", "Companion", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
public enum BluetoothConnectionType {
    LOW_ENERGY("low-energy", 1),
    CLASSIC("classic", 2);

    private final int connectionType;
    private final String urlParam;
    private static final /* synthetic */ a $ENTRIES = b.g(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<c<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, Companion.AnonymousClass1.INSTANCE);

    BluetoothConnectionType(String str, int i14) {
        this.urlParam = str;
        this.connectionType = i14;
    }

    public static a<BluetoothConnectionType> getEntries() {
        return $ENTRIES;
    }

    public final int getConnectionType() {
        return this.connectionType;
    }

    public final String getUrlParam() {
        return this.urlParam;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/device/sharing/management/dtos/BluetoothConnectionType;", "serializer", "()Li63/c;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.garmin.device.sharing.management.dtos.BluetoothConnectionType$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends w implements e23.a<c<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // e23.a
            public final c<Object> invoke() {
                final String[] strArr = {"low_energy"};
                final String[] strArr2 = {"classic"};
                return k1.d("com.garmin.device.sharing.management.dtos.BluetoothConnectionType", BluetoothConnectionType.values(), new String[]{"LOW_ENERGY", "CLASSIC"}, new Annotation[][]{new Annotation[]{new s(strArr) { // from class: com.garmin.device.sharing.management.dtos.BluetoothConnectionType$Companion$annotationImpl$kotlinx_serialization_json_JsonNames$0
                    private final /* synthetic */ String[] names;

                    {
                        strArr.getClass();
                        this.names = strArr;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return s.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof s) && Arrays.equals(names(), ((s) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(this.names) ^ 397397176;
                    }

                    @Override // n63.s
                    public final /* synthetic */ String[] names() {
                        return this.names;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return j.m("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.names), ")");
                    }
                }}, new Annotation[]{new s(strArr2) { // from class: com.garmin.device.sharing.management.dtos.BluetoothConnectionType$Companion$annotationImpl$kotlinx_serialization_json_JsonNames$0
                    private final /* synthetic */ String[] names;

                    {
                        strArr2.getClass();
                        this.names = strArr2;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return s.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof s) && Arrays.equals(names(), ((s) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(this.names) ^ 397397176;
                    }

                    @Override // n63.s
                    public final /* synthetic */ String[] names() {
                        return this.names;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return j.m("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.names), ")");
                    }
                }}});
            }
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private final /* synthetic */ c get$cachedSerializer() {
            return (c) BluetoothConnectionType.$cachedSerializer$delegate.getValue();
        }

        public final c<BluetoothConnectionType> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
