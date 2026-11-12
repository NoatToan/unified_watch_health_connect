package com.huami.healthlabel.web;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/web/JsonParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class JsonParseException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public JsonParseException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JsonParseException(@Nullable Throwable th) {
        super("json解析发生错误", th);
    }

    public /* synthetic */ JsonParseException(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }
}
