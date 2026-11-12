package com.huami.sleepassistant.lib.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import com.huami.sleepassistant.lib.jsbridge.BridgeConstant;
import com.huami.sleepassistant.lib.ui.SleepAssistantActivity;
import com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsActivity;
import com.huami.sleepassistant.lib.ui.breathe.begins.TrainingBeginsStressActivity;
import com.huami.sleepassistant.lib.ui.breathe.training.BreatheTrainingActivity;
import com.huami.sleepassistant.lib.ui.breathe.training.MiBreatheTrainingActivity;
import com.huami.sleepassistant.lib.ui.music.MusicWebActivity;
import com.huami.sleepassistant.lib.ui.temperament.sort.SortCollectionActivity;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¨\u0006\u0017"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/Navigator;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "startSleepAsistant", "startMusicPlayer", "startMiMusicPlayer", "startMiBreatheTraining", "startBreatheTraining", "", "breatheTrainingType", "startTrainingBegins", "Landroid/app/Activity;", "activity", "startTrainingBeginsStress", "startSetAlarm", "", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "dataList", "startSortCollection", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Navigator {

    @NotNull
    public static final Navigator INSTANCE = new Navigator();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setPrettyPrint(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    private Navigator() {
    }

    public final void startBreatheTraining(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) BreatheTrainingActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void startMiBreatheTraining(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) MiBreatheTrainingActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void startMiMusicPlayer(@NotNull Context context) {
        MusicWebActivity.INSTANCE.launch(context, BridgeConstant.INSTANCE.buildMiWebItem());
    }

    public final void startMusicPlayer(@NotNull Context context) {
        MusicWebActivity.INSTANCE.launch(context, BridgeConstant.INSTANCE.buildWebItem());
    }

    public final void startSetAlarm(@NotNull Context context) {
        context.startActivity(new Intent("android.intent.action.SET_ALARM"));
    }

    public final void startSleepAsistant(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SleepAssistantActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void startSortCollection(@NotNull Context context, @NotNull List<LiveMusicVo> dataList) {
        context.startActivity(new Intent(context, (Class<?>) SortCollectionActivity.class).putExtra("KEY", JsonKt.Json$default(null, a.a, 1, null).encodeToString(BuiltinSerializersKt.ListSerializer(LiveMusicVo.INSTANCE.serializer()), dataList)));
    }

    public final void startTrainingBegins(@NotNull Context context) {
        Intent intent = new Intent(context, (Class<?>) TrainingBeginsActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void startTrainingBeginsStress(@NotNull Activity activity) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) TrainingBeginsStressActivity.class), 111);
    }

    public final void startBreatheTraining(@NotNull Context context, int breatheTrainingType) {
        Intent intent = new Intent(context, (Class<?>) BreatheTrainingActivity.class);
        intent.putExtra(BreatheTrainingActivity.BREATHE_TRAINING_TYPE_KEY, breatheTrainingType);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
