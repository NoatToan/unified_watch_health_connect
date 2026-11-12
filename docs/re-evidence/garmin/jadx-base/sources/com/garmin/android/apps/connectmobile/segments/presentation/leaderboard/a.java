package com.garmin.android.apps.connectmobile.segments.presentation.leaderboard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import e23.p;
import eg1.j;
import f12.l;
import java.util.Arrays;
import java.util.Locale;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardActivity$updateLeaderboardSnapshot$1$1", f = "SegmentLeaderboardActivity.kt", l = {243}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentLeaderboardActivity f41498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserRankDTO f41499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f41500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SegmentLeaderboardActivity segmentLeaderboardActivity, UserRankDTO userRankDTO, ViewGroup viewGroup, d<? super a> dVar) {
        super(2, dVar);
        this.f41498b = segmentLeaderboardActivity;
        this.f41499c = userRankDTO;
        this.f41500d = viewGroup;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f41498b, this.f41499c, this.f41500d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String string;
        String string2;
        String string3;
        View viewA;
        View viewA2;
        String string4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f41497a;
        if (i14 == 0) {
            r.b(obj);
            SegmentLeaderboardActivity.a aVar2 = SegmentLeaderboardActivity.f41454p;
            this.f41497a = 1;
            aVar2.getClass();
            UserRankDTO userRankDTO = this.f41499c;
            if (userRankDTO == null || TextUtils.isEmpty(userRankDTO.f41253e) || TextUtils.isEmpty(userRankDTO.f41266r)) {
                objA = null;
            } else {
                boolean zG = s.g(userRankDTO.f41253e, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
                SegmentLeaderboardActivity segmentLeaderboardActivity = this.f41498b;
                if (zG) {
                    boolean zG2 = s.g(userRankDTO.f41253e, userRankDTO.f41266r);
                    long j8 = userRankDTO.f41251c;
                    if (zG2) {
                        SegmentLeaderboardActivity.a.C0788a c0788a = new SegmentLeaderboardActivity.a.C0788a(1, j8, new b12.b(userRankDTO.f41252d, null, null, null, null, 30, null));
                        View viewInflate = View.inflate(segmentLeaderboardActivity, R.layout.gcm_leaderboard_list_header_one_rank, null);
                        TextView textView = (TextView) viewInflate.findViewById(R.id.leaderboard_header_rank);
                        TextView textView2 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_rank_result);
                        UserLevelImageView userLevelImageView = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture);
                        x0 x0Var = x0.f105818a;
                        Locale locale = Locale.getDefault();
                        String string5 = segmentLeaderboardActivity.getString(R.string.format_decimal_value);
                        string5.getClass();
                        String str = String.format(locale, string5, Arrays.copyOf(new Object[]{Integer.valueOf(c0788a.f41470a)}, 1));
                        textView.setText(str);
                        textView.setContentDescription(segmentLeaderboardActivity.getString(R.string.segments_rank, str));
                        long j14 = c0788a.f41471b;
                        if (j14 > 0) {
                            l3.f23124b.getClass();
                            string4 = l3.a.b1(j14);
                        } else {
                            string4 = segmentLeaderboardActivity.getString(R.string.no_value);
                        }
                        textView2.setText(string4);
                        textView2.setContentDescription(j.b(segmentLeaderboardActivity, j14));
                        userLevelImageView.setProfileImageData(c0788a.f41472c);
                        objA = viewInflate;
                    } else {
                        viewA2 = SegmentLeaderboardActivity.a.a(segmentLeaderboardActivity, new SegmentLeaderboardActivity.a.C0788a(1, j8, new b12.b(userRankDTO.f41252d, null, null, null, null, 30, null)), new SegmentLeaderboardActivity.a.C0788a(userRankDTO.f41263o, userRankDTO.f41264p, new b12.b(userRankDTO.f41265q, null, null, null, null, 30, null)), 1);
                    }
                } else if (s.g(userRankDTO.f41266r, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                    viewA = SegmentLeaderboardActivity.a.a(segmentLeaderboardActivity, new SegmentLeaderboardActivity.a.C0788a(1, userRankDTO.f41251c, new b12.b(userRankDTO.f41252d, null, null, null, null, 30, null)), new SegmentLeaderboardActivity.a.C0788a(userRankDTO.f41263o, userRankDTO.f41264p, new b12.b(userRankDTO.f41265q, null, null, null, null, 30, null)), userRankDTO.f41263o);
                } else {
                    int i15 = userRankDTO.f41249a;
                    long j15 = userRankDTO.f41251c;
                    if (i15 <= 0) {
                        SegmentLeaderboardActivity.a.C0788a c0788a2 = new SegmentLeaderboardActivity.a.C0788a(1, j15, new b12.b(userRankDTO.f41252d, null, null, null, null, 30, null));
                        l.f68084a.getClass();
                        String strZ4 = l.a.a().z4("PREMIUM_PROFILE");
                        if (strZ4 == null) {
                            strZ4 = l.a.a().q4();
                        }
                        objA = SegmentLeaderboardActivity.a.a(segmentLeaderboardActivity, c0788a2, new SegmentLeaderboardActivity.a.C0788a(0, 0L, new b12.b(strZ4, null, null, null, null, 30, null)), 0);
                    } else {
                        SegmentLeaderboardActivity.a.C0788a c0788a3 = new SegmentLeaderboardActivity.a.C0788a(1, j15, null, 4, null);
                        SegmentLeaderboardActivity.a.C0788a c0788a4 = new SegmentLeaderboardActivity.a.C0788a(userRankDTO.f41263o, userRankDTO.f41264p, null, 4, null);
                        int i16 = userRankDTO.f41249a;
                        long j16 = userRankDTO.f41250b;
                        l.f68084a.getClass();
                        String strZ5 = l.a.a().z4("PREMIUM_PROFILE");
                        if (strZ5 == null) {
                            strZ5 = l.a.a().q4();
                        }
                        SegmentLeaderboardActivity.a.C0788a c0788a5 = new SegmentLeaderboardActivity.a.C0788a(i16, j16, new b12.b(strZ5, null, null, null, null, 30, null));
                        View viewInflate2 = View.inflate(segmentLeaderboardActivity, R.layout.gcm_leaderboard_list_header_three_rank, null);
                        TextView textView3 = (TextView) viewInflate2.findViewById(R.id.leaderboard_header_first_rank);
                        TextView textView4 = (TextView) viewInflate2.findViewById(R.id.leaderboard_header_current_user_rank);
                        TextView textView5 = (TextView) viewInflate2.findViewById(R.id.leaderboard_header_last_rank);
                        TextView textView6 = (TextView) viewInflate2.findViewById(R.id.leaderboard_header_first_rank_result);
                        TextView textView7 = (TextView) viewInflate2.findViewById(R.id.leaderboard_header_current_user_rank_result);
                        TextView textView8 = (TextView) viewInflate2.findViewById(R.id.leaderboard_header_last_rank_result);
                        UserLevelImageView userLevelImageView2 = (UserLevelImageView) viewInflate2.findViewById(R.id.leaderboard_header_profile_picture);
                        x0 x0Var2 = x0.f105818a;
                        Locale locale2 = Locale.getDefault();
                        String string6 = segmentLeaderboardActivity.getString(R.string.format_decimal_value);
                        string6.getClass();
                        String str2 = String.format(locale2, string6, Arrays.copyOf(new Object[]{Integer.valueOf(c0788a3.f41470a)}, 1));
                        textView3.setText(str2);
                        textView3.setContentDescription(segmentLeaderboardActivity.getString(R.string.segments_rank, str2));
                        long j17 = c0788a3.f41471b;
                        if (j17 > 0) {
                            l3.f23124b.getClass();
                            string = l3.a.b1(j17);
                        } else {
                            string = segmentLeaderboardActivity.getString(R.string.no_value);
                        }
                        textView6.setText(string);
                        textView6.setContentDescription(j.b(segmentLeaderboardActivity, j17));
                        Locale locale3 = Locale.getDefault();
                        String string7 = segmentLeaderboardActivity.getString(R.string.format_decimal_value);
                        string7.getClass();
                        String str3 = String.format(locale3, string7, Arrays.copyOf(new Object[]{Integer.valueOf(c0788a4.f41470a)}, 1));
                        textView5.setText(str3);
                        textView5.setContentDescription(segmentLeaderboardActivity.getString(R.string.segments_rank, str3));
                        long j18 = c0788a4.f41471b;
                        if (j18 > 0) {
                            l3.f23124b.getClass();
                            string2 = l3.a.b1(j18);
                        } else {
                            string2 = segmentLeaderboardActivity.getString(R.string.no_value);
                        }
                        textView8.setText(string2);
                        textView8.setContentDescription(j.b(segmentLeaderboardActivity, j18));
                        Locale locale4 = Locale.getDefault();
                        String string8 = segmentLeaderboardActivity.getString(R.string.format_decimal_value);
                        string8.getClass();
                        String str4 = String.format(locale4, string8, Arrays.copyOf(new Object[]{Integer.valueOf(c0788a5.f41470a)}, 1));
                        textView4.setText(str4);
                        textView4.setContentDescription(segmentLeaderboardActivity.getString(R.string.segments_rank, str4));
                        long j19 = c0788a5.f41471b;
                        if (j19 > 0) {
                            l3.f23124b.getClass();
                            string3 = l3.a.b1(j19);
                        } else {
                            string3 = segmentLeaderboardActivity.getString(R.string.no_value);
                        }
                        textView7.setText(string3);
                        textView7.setContentDescription(j.b(segmentLeaderboardActivity, j19));
                        userLevelImageView2.setProfileImageData(c0788a5.f41472c);
                        objA = viewInflate2;
                    }
                }
            }
            if (objA == aVar) {
                objA = viewA;
                objA = viewA2;
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = obj;
        }
        objA = viewA;
        objA = viewA2;
        View view2 = (View) objA;
        if (view2 != null) {
            this.f41500d.addView(view2);
        }
        return Unit.INSTANCE;
    }
}
