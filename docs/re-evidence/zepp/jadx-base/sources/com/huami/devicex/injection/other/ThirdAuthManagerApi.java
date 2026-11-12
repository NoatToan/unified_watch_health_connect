package com.huami.devicex.injection.other;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/devicex/injection/other/ThirdAuthManagerApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "syncAuthUrlSettings", "Landroidx/fragment/app/FragmentManager;", "fm", "showAlexaAuthLawDialog", "showAlexaLanguageSetting", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ThirdAuthManagerApi {
    void showAlexaAuthLawDialog(@NotNull Context context, @NotNull FragmentManager fm);

    void showAlexaLanguageSetting(@NotNull Context context, @NotNull FragmentManager fm);

    void syncAuthUrlSettings(@NotNull Context context);
}
