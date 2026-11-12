package pm0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import i3.e5;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpm0/a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f138595a = new a();

    private a() {
    }

    public static String a(GroupDetailsDTO groupDetailsDTO) {
        groupDetailsDTO.getClass();
        return e5.g(((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).i(), "/", String.format("modern/challenge/create-challenge?groupId=%s&from=group", Arrays.copyOf(new Object[]{groupDetailsDTO.f31558a}, 1)));
    }

    public static final void b(Context context, GroupChallengeDTO groupChallengeDTO) {
        if (groupChallengeDTO.f31513b == GroupChallengeDTO.b.UPCOMING) {
            ((jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null)).a(context, groupChallengeDTO);
            return;
        }
        jm0.b bVar = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        String str = groupChallengeDTO.f31518g;
        str.getClass();
        bVar.o(context, str);
    }
}
