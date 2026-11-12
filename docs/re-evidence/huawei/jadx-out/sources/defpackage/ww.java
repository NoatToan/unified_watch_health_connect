package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: loaded from: classes21.dex */
public class ww extends wn {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JsonToken f52553b;

    public ww(JsonParser jsonParser, JsonToken jsonToken, String str) {
        super(jsonParser, str);
        this.f52553b = jsonToken;
    }
}
