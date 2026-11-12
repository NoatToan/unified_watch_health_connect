package g83;

import c83.h;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class c<T extends MessageLite> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parser<T> f76453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtensionRegistryLite f76454b;

    public c(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        this.f76453a = parser;
        this.f76454b = extensionRegistryLite;
    }

    @Override // c83.h
    public final Object convert(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        ExtensionRegistryLite extensionRegistryLite = this.f76454b;
        Parser<T> parser = this.f76453a;
        try {
            try {
                T from = extensionRegistryLite == null ? parser.parseFrom(responseBody2.byteStream()) : parser.parseFrom(responseBody2.byteStream(), extensionRegistryLite);
                responseBody2.close();
                return from;
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException(e4);
            }
        } catch (Throwable th3) {
            responseBody2.close();
            throw th3;
        }
    }
}
