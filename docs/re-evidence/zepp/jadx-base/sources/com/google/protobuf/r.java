package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class r {
    private r() {
    }

    public static Internal.BooleanList a() {
        return BooleanArrayList.emptyList();
    }

    public static Internal.DoubleList b() {
        return DoubleArrayList.emptyList();
    }

    public static Internal.FloatList c() {
        return FloatArrayList.emptyList();
    }

    public static Internal.IntList d() {
        return IntArrayList.emptyList();
    }

    public static Internal.LongList e() {
        return LongArrayList.emptyList();
    }

    public static <E> Internal.ProtobufList<E> f() {
        return ProtobufArrayList.emptyList();
    }

    public static <E> Internal.ProtobufList<E> g(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static Internal.BooleanList h() {
        return new BooleanArrayList();
    }

    public static Internal.DoubleList i() {
        return new DoubleArrayList();
    }

    public static Internal.FloatList j() {
        return new FloatArrayList();
    }

    public static Internal.IntList k() {
        return new IntArrayList();
    }

    public static Internal.LongList l() {
        return new LongArrayList();
    }
}
