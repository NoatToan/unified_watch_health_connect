package com.google.firebase.encoders;

/* JADX INFO: loaded from: classes2.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d14);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f14);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i14);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j8);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z14);

    @Deprecated
    ObjectEncoderContext add(String str, double d14);

    @Deprecated
    ObjectEncoderContext add(String str, int i14);

    @Deprecated
    ObjectEncoderContext add(String str, long j8);

    @Deprecated
    ObjectEncoderContext add(String str, Object obj);

    @Deprecated
    ObjectEncoderContext add(String str, boolean z14);

    ObjectEncoderContext inline(Object obj);

    ObjectEncoderContext nested(FieldDescriptor fieldDescriptor);

    ObjectEncoderContext nested(String str);
}
