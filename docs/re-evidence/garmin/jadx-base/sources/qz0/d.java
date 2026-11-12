package qz0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedItem;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.newsfeed.pagination.NewsFeedPagingSource", f = "NewsFeedPagingSource.kt", l = {43, 44, 50, 63}, m = "load", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f148618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewsFeedItem.SuggestedFollowingList f148619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2.b f148620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityListDTO f148621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f148622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f148623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f148624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f148625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f148626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f148627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f148626i = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148625h = obj;
        this.f148627j |= Integer.MIN_VALUE;
        return this.f148626i.e(null, this);
    }
}
