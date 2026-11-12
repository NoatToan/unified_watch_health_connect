package com.huami.bluetooth.profile.channel.module.todo.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoListCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "", "value", "encode", "decode", "", "a", "Z", "firstRemindEnable", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCodec;", "b", "Lcom/huami/bluetooth/profile/channel/module/todo/impl/TodoCodec;", "codec", "<init>", "(Z)V", "c", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TodoListCodec implements Codec<List<? extends Todo>, byte[]> {

    @Deprecated
    public static final int COUNT_BYTE_LEN = 2;

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean firstRemindEnable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TodoCodec codec;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/channel/module/todo/impl/TodoListCodec$a", "", "", "COUNT_BYTE_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TodoListCodec() {
        this(false, 1, null);
    }

    public TodoListCodec(boolean z) {
        this.firstRemindEnable = z;
        this.codec = new TodoCodec(z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends Todo> list) {
        return encode2((List<Todo>) list);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<Todo> decode(@NotNull byte[] value) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = TodoCodec.INSTANCE.split$bluetooth_release(value, 2, this.firstRemindEnable).iterator();
        while (it2.hasNext()) {
            try {
                arrayList.add(this.codec.decode((byte[]) it2.next()));
            } catch (Exception unused) {
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public byte[] encode2(@NotNull List<Todo> value) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ByteUtilsKt.toByteArray(value.size(), 2));
        Iterator<T> it2 = value.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(this.codec.encode((Todo) it2.next()));
        }
        return byteArrayOutputStream.toByteArray();
    }

    public /* synthetic */ TodoListCodec(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
