package defpackage;

import android.text.TextUtils;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.xiaomi.ai.api.Nlp;
import com.xiaomi.ai.api.Phone;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class eth {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static c4h f17048k = new c4h(JsonNodeFactory.instance);
    public static Instruction<Nlp.AuxiliaryIntention> l;
    public static Instruction[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f17049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Instruction<Phone.MakeCall> f17050b;
    public Instruction<Phone.ShowContacts> c;
    public Instruction<Nlp.AuxiliaryIntention> d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public String j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final eth f17051a = new eth();
    }

    public static eth b() {
        return a.f17051a;
    }

    public static Instruction<Nlp.AuxiliaryIntention> c() {
        return l;
    }

    public static Instruction[] d() {
        return m;
    }

    public static c4h e() {
        return f17048k;
    }

    public static void h(c4h c4hVar) {
        f17048k = c4hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Instruction[] instructionArr) {
        for (int i = 0; i < instructionArr.length; i++) {
            Instruction instruction = instructionArr[i];
            Optional<String> dialogId = instruction.getDialogId();
            String fullName = instruction.getFullName();
            fullName.hashCode();
            switch (fullName) {
                case "Phone.MakeCall":
                    this.f17050b = instruction;
                    this.e = i;
                    if (dialogId.c() && !TextUtils.isEmpty(dialogId.b())) {
                        f(dialogId.b());
                        break;
                    } else {
                        break;
                    }
                    break;
                case "Phone.ShowContacts":
                    this.c = instruction;
                    this.f = i;
                    if (dialogId.c() && !TextUtils.isEmpty(dialogId.b())) {
                        f(dialogId.b());
                        break;
                    } else {
                        break;
                    }
                    break;
                case "Nlp.AuxiliaryIntention":
                    if (!Nlp.IntentionType.PHONE.equals(((Nlp.AuxiliaryIntention) instruction.getPayload()).getType())) {
                        break;
                    } else {
                        this.d = instruction;
                        h(((Nlp.AuxiliaryIntention) instruction.getPayload()).getIntention());
                        l = instruction;
                        if (dialogId.c() && !TextUtils.isEmpty(dialogId.b())) {
                            f(dialogId.b());
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public void f(String str) {
        if (this.j.equals(str)) {
            return;
        }
        this.j = str;
    }

    public void g(Instruction[] instructionArr) {
        if (Arrays.equals(instructionArr, m)) {
            return;
        }
        this.f17050b = null;
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.f17049a.set(false);
        a(instructionArr);
        m = instructionArr;
    }

    public eth() {
        this.f17049a = new AtomicBoolean(false);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.i = false;
        this.j = "";
    }
}
