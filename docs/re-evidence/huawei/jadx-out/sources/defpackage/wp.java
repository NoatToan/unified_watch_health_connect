package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;

/* JADX INFO: loaded from: classes21.dex */
public class wp extends wr {
    private static final long serialVersionUID = 123;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient JsonGenerator f52295b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(String str, JsonGenerator jsonGenerator) {
        super(str, (wq) null);
        this.f52295b = jsonGenerator;
    }

    @Override // defpackage.wr, com.fasterxml.jackson.core.JacksonException
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public JsonGenerator getProcessor() {
        return this.f52295b;
    }
}
