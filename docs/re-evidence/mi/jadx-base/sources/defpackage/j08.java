package defpackage;

import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.phonecall.PhonecallAppFacadeV3;

/* JADX INFO: loaded from: classes7.dex */
public class j08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qpe f22283a = aqe.f(j08.class);

    public static Context a(Instruction instruction) {
        try {
            return PhonecallAppFacadeV3.getInstance().clearPrivacyInfo(instruction);
        } catch (Exception e) {
            f22283a.error("clearAnswerPrivacyInfo() occur error: {}", (Throwable) e);
            return null;
        }
    }
}
