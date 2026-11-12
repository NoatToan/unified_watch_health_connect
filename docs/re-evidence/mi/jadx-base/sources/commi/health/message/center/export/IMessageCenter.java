package commi.health.message.center.export;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcommi/health/message/center/export/IMessageCenter;", "", "gotoMessageCenterActivity", "", "context", "Landroid/content/Context;", "showNewMsgDotEnable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "message-center-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IMessageCenter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcommi/health/message/center/export/IMessageCenter$Companion;", "", "<init>", "()V", "message-center-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void gotoMessageCenterActivity(@NotNull Context context);

    @Nullable
    Object showNewMsgDotEnable(@NotNull Continuation<? super Boolean> continuation);
}
