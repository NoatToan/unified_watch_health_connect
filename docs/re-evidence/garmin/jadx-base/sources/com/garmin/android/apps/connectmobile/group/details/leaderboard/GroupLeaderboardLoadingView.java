package com.garmin.android.apps.connectmobile.group.details.leaderboard;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import uo1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/leaderboard/GroupLeaderboardLoadingView;", "Luo1/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupLeaderboardLoadingView extends d {
    public /* synthetic */ GroupLeaderboardLoadingView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupLeaderboardLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupLeaderboardLoadingView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14, R.layout.group_leaderboard_loading);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GroupLeaderboardLoadingView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
