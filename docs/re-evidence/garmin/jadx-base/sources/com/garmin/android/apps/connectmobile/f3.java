package com.garmin.android.apps.connectmobile;

import com.garmin.gcsprotos.generated.Auth;
import com.garmin.gcsprotos.generated.DataTypesProto;
import com.garmin.gcsprotos.generated.FitnessDeviceProto;
import com.garmin.gcsprotos.generated.FitnessProto;
import com.garmin.gcsprotos.generated.FitnessSocialProto;
import com.garmin.proto.generated.GDIBikeLight;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIDezlProto;
import com.garmin.proto.generated.GDIDog;
import com.garmin.proto.generated.GDIExploreSyncProto;
import com.garmin.proto.generated.GDIFileAccess;
import com.garmin.proto.generated.GDIHSAData;
import com.garmin.proto.generated.GDIInReachContactSync;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.garmin.proto.generated.GDIInReachTracking;
import com.garmin.proto.generated.GDIInReachWeather;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringArrayList;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f3 {
    public static Object A(int i14) {
        return GDIDezlProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object B(int i14) {
        return GDIDog.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object C(int i14) {
        return GDIExploreSyncProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static int a(int i14, Integer num) {
        return CodedOutputStream.computeEnumSizeNoTag(num.intValue()) + i14;
    }

    public static int b(Internal.IntList intList, int i14, int i15) {
        return CodedOutputStream.computeUInt32SizeNoTag(intList.getInt(i14)) + i15;
    }

    public static int c(Internal.IntList intList, int i14, CodedOutputStream codedOutputStream, int i15, int i16, int i17) {
        codedOutputStream.writeUInt32(i15, intList.getInt(i14));
        return i16 + i17;
    }

    public static int d(LazyStringArrayList lazyStringArrayList, int i14, int i15) {
        return GeneratedMessageV3.computeStringSizeNoTag(lazyStringArrayList.getRaw(i14)) + i15;
    }

    public static int e(LazyStringArrayList lazyStringArrayList, int i14, CodedOutputStream codedOutputStream, int i15, int i16, int i17) {
        GeneratedMessageV3.writeString(codedOutputStream, i15, lazyStringArrayList.getRaw(i14));
        return i16 + i17;
    }

    public static int f(Integer num, CodedOutputStream codedOutputStream, int i14, int i15, int i16) {
        codedOutputStream.writeEnum(i14, num.intValue());
        return i15 + i16;
    }

    public static Object g(int i14) {
        return Auth.getDescriptor().getMessageTypes().get(i14);
    }

    public static String h(Exception exc, String str, String str2) {
        return str + exc + str2;
    }

    public static String i(StringBuilder sb3, Integer num, String str) {
        sb3.append(num);
        sb3.append(str);
        return sb3.toString();
    }

    public static StringBuilder j(Long l14, Long l15, String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(l14);
        sb3.append(str2);
        sb3.append(l15);
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder k(String str, String str2, String str3, List list, List list2) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(list);
        sb3.append(str2);
        sb3.append(list2);
        sb3.append(str3);
        return sb3;
    }

    public static ZoneOffset l(Instant instant) {
        return ZoneId.systemDefault().getRules().getOffset(instant);
    }

    public static void m(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static Object n(int i14) {
        return DataTypesProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object o(int i14) {
        return GDIExploreSyncProto.getDescriptor().getEnumTypes().get(i14);
    }

    public static Object p(int i14) {
        return GDIFileAccess.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object q(int i14) {
        return GDIHSAData.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object r(int i14) {
        return GDIInReachContactSync.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object s(int i14) {
        return GDIInReachMessaging.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object t(int i14) {
        return GDIInReachTracking.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object u(int i14) {
        return GDIInReachWeather.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object v(int i14) {
        return FitnessDeviceProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object w(int i14) {
        return FitnessProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object x(int i14) {
        return FitnessSocialProto.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object y(int i14) {
        return GDIBikeLight.getDescriptor().getMessageTypes().get(i14);
    }

    public static Object z(int i14) {
        return GDICore.getDescriptor().getMessageTypes().get(i14);
    }
}
