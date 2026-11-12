package com.airoha.location;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TGnssProvider {
    public static native String native_get_version();

    public static native ArrayList<SimpleLocation> native_process_location(ArrayList<TGCData> arrayList, TGCParameter tGCParameter);
}
