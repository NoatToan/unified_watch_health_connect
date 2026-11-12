package com.huami.http.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: loaded from: classes10.dex */
@MustBeDocumented
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/huami/http/annotation/DelicateHttpApi;", "", "httpkit_release"}, k = 1, mv = {1, 5, 1})
@RequiresOptIn(level = RequiresOptIn.Level.WARNING, message = "该 API 在特定场景会抛出 IOException 等异常，请在需要时进行 try catch，考虑使用 safeHttpXXX 或 safeAwaitHttpXXX 函数进行替换")
@Documented
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface DelicateHttpApi {
}
