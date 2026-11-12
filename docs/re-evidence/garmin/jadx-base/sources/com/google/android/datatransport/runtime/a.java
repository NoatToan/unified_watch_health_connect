package com.google.android.datatransport.runtime;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements TransportScheduleCallback {
    public static FieldDescriptor a(int i14, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i14).build()).build();
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(Exception exc) {
        TransportImpl.lambda$send$0(exc);
    }
}
