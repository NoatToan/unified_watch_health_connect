package com.mi.health.course.eco.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.mi.health.course.eco.activity.EcoCourseLinkTipActivity;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.util.CoursePreference;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.oqi;
import defpackage.sti;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/mi/health/course/eco/activity/EcoCourseLinkTipActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoCourseLinkTipActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(EcoCourseLinkTipActivity this$0, Integer num, Ref.ObjectRef model, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        CoursePreference.INSTANCE.setShowLinkTip(false);
        int iIntValue = num.intValue();
        Intent intent = this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        EcoCourseLinkTipActivityKt.judgeIntent(this$0, iIntValue, intent, (String) model.element);
        this$0.finish();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Serializable serializableExtra = getIntent().getSerializableExtra("course_info");
        CourseAllInfo courseAllInfo = serializableExtra instanceof CourseAllInfo ? (CourseAllInfo) serializableExtra : null;
        final Integer numValueOf = courseAllInfo != null ? Integer.valueOf(courseAllInfo.getType()) : null;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = getIntent().getStringExtra("course_device_model");
        Logger.d("EcoCourseLinkTipActivity", "onCreate: " + numValueOf);
        if (numValueOf == null || numValueOf.intValue() == 0) {
            finish();
            return;
        }
        CharSequence charSequence = (CharSequence) objectRef.element;
        if (charSequence == null || charSequence.length() == 0) {
            objectRef.element = "ksmb.treadmill.m1v1";
        }
        getWindow().setFlags(1024, 1024);
        setContentView(sti.e);
        findViewById(oqi.B).setOnClickListener(new View.OnClickListener() { // from class: co7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseLinkTipActivity.onCreate$lambda$0(this.f5595a, numValueOf, objectRef, view);
            }
        });
    }
}
