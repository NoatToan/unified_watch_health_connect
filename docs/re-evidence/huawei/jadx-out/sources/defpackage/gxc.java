package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gxc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("questionResult")
    private List<gwy> f36180c;

    public void a(List<gwy> list) {
        this.f36180c = list;
    }

    public List<gwy> d() {
        return this.f36180c;
    }

    public String toString() {
        return "{\"QuestionnaireResult\": {\"questionnaire\":" + this.f36180c + "}}";
    }
}
