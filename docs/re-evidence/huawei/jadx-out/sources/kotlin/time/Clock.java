package kotlin.time;

import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import defpackage.zfq;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lkotlin/time/Clock;", "", "now", "Lkotlin/time/Instant;", CardMgrSdkConst.MSGScene.SYSTEM, "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Clock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f39338a;

    zfq now();

    /* JADX INFO: renamed from: kotlin.time.Clock$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/time/Clock$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f39338a = new Companion();

        private Companion() {
        }
    }
}
