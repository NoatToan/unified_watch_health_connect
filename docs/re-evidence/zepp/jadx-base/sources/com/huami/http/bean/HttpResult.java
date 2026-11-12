package com.huami.http.bean;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0004\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/http/bean/HttpResult;", "", "Lokhttp3/Response;", "getOrNull", "Lkotlin/Function1;", "", "action", "onResponse", "", "onException", "<init>", "()V", AVSAPIConstants.System.Exception.NAME, SOAP.RESPONSE, "Lcom/huami/http/bean/HttpResult$Response;", "Lcom/huami/http/bean/HttpResult$Exception;", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public abstract class HttpResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/http/bean/HttpResult$Exception;", "Lcom/huami/http/bean/HttpResult;", "", "component1", "throwable", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Exception extends HttpResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final Throwable throwable;

        public Exception(@NotNull Throwable th) {
            super(null);
            this.throwable = th;
        }

        public static /* synthetic */ Exception copy$default(Exception exception, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = exception.throwable;
            }
            return exception.copy(th);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final Exception copy(@NotNull Throwable throwable) {
            return new Exception(throwable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exception) && Intrinsics.areEqual(this.throwable, ((Exception) other).throwable);
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return "Exception(throwable=" + this.throwable + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/http/bean/HttpResult$Response;", "Lcom/huami/http/bean/HttpResult;", "Lokhttp3/Response;", "component1", AbstractJSONTokenResponse.RESPONSE, "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "<init>", "(Lokhttp3/Response;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Response extends HttpResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final okhttp3.Response response;

        public Response(@NotNull okhttp3.Response response) {
            super(null);
            this.response = response;
        }

        public static /* synthetic */ Response copy$default(Response response, okhttp3.Response response2, int i, Object obj) {
            if ((i & 1) != 0) {
                response2 = response.response;
            }
            return response.copy(response2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final okhttp3.Response getResponse() {
            return this.response;
        }

        @NotNull
        public final Response copy(@NotNull okhttp3.Response response) {
            return new Response(response);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && Intrinsics.areEqual(this.response, ((Response) other).response);
        }

        @NotNull
        public final okhttp3.Response getResponse() {
            return this.response;
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        @NotNull
        public String toString() {
            return "Response(response=" + this.response + ")";
        }
    }

    private HttpResult() {
    }

    public /* synthetic */ HttpResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final okhttp3.Response getOrNull() {
        if (this instanceof Response) {
            return ((Response) this).getResponse();
        }
        return null;
    }

    @NotNull
    public final HttpResult onException(@NotNull Function1<? super Throwable, Unit> action) {
        if (this instanceof Exception) {
            action.invoke(((Exception) this).getThrowable());
        }
        return this;
    }

    @NotNull
    public final HttpResult onResponse(@NotNull Function1<? super okhttp3.Response, Unit> action) {
        if (this instanceof Response) {
            action.invoke(((Response) this).getResponse());
        }
        return this;
    }
}
