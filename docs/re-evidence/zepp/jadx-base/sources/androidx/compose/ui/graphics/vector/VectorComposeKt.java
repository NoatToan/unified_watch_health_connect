package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.constraintlayout.motion.widget.Key;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0082\u0001\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a©\u0001\u0010&\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"", "name", "", Key.ROTATION, "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Group", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", MAPCookie.KEY_PATH, "ui_release"}, k = 2, mv = {1, 5, 1})
public final class VectorComposeKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:120:0x0178  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:127:0x0185  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x019e  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x024a  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    @Composable
    public static final void Group(@Nullable String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @Nullable List<? extends PathNode> list, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f8;
        int i7;
        int i8;
        float f9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        List<? extends PathNode> emptyPath;
        AnonymousClass1 anonymousClass1;
        final float f15;
        final float f16;
        final float f17;
        final float f18;
        final float f19;
        final String str3;
        final List<? extends PathNode> list2;
        final float f20;
        final float f21;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(383574212);
        int i18 = i2 & 1;
        if (i18 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i19 = i2 & 2;
        if (i19 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                        f8 = f3;
                        if (composerStartRestartGroup.changed(f8)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            f9 = f4;
                            if (composerStartRestartGroup.changed(f9)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                        } else if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(f5)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & 64;
                        if (i12 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(f6)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        i14 = i2 & 128;
                        if (i14 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(f7)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i3 |= i15;
                        }
                        i16 = i2 & 256;
                        if (i16 != 0) {
                            i3 |= 33554432;
                        }
                        if ((i2 & 512) != 0) {
                            if ((1879048192 & i) == 0) {
                                if (composerStartRestartGroup.changed(function2)) {
                                    i17 = 536870912;
                                } else {
                                    i17 = 268435456;
                                }
                            }
                            if (((~i2) & 256) != 0 && ((1533916891 & i3) ^ 306783378) == 0 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                str3 = str;
                                f20 = f;
                                f15 = f2;
                                f17 = f5;
                                f18 = f6;
                                f16 = f7;
                                list2 = list;
                                f21 = f8;
                                f19 = f9;
                            } else {
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.startDefaults();
                                    if (i18 != 0) {
                                        str2 = "";
                                    } else {
                                        str2 = str;
                                    }
                                    if (i19 != 0) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = f;
                                    }
                                    if (i4 != 0) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = f2;
                                    }
                                    if (i6 != 0) {
                                        f8 = 0.0f;
                                    }
                                    if (i8 != 0) {
                                        f9 = 1.0f;
                                    }
                                    f12 = i10 == 0 ? f5 : 1.0f;
                                    if (i12 != 0) {
                                        f13 = 0.0f;
                                    } else {
                                        f13 = f6;
                                    }
                                    f14 = i14 == 0 ? f7 : 0.0f;
                                    if (i16 != 0) {
                                        emptyPath = VectorKt.getEmptyPath();
                                        i3 &= -234881025;
                                    } else {
                                        emptyPath = list;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                } else {
                                    composerStartRestartGroup.skipCurrentGroup();
                                    if (i16 != 0) {
                                        i3 &= -234881025;
                                    }
                                    str2 = str;
                                    f10 = f;
                                    f11 = f2;
                                    f12 = f5;
                                    f13 = f6;
                                    f14 = f7;
                                    emptyPath = list;
                                }
                                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final GroupComponent invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(anonymousClass1);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                                Updater.m906setimpl(composerM899constructorimpl, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                        invoke2(groupComponent, str4);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                        groupComponent.setName(str4);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setRotation(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setPivotX(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setPivotY(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setScaleX(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setScaleY(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setTranslationX(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                        invoke(groupComponent, f22.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                        groupComponent.setTranslationY(f22);
                                    }
                                });
                                Updater.m906setimpl(composerM899constructorimpl, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                        invoke2(groupComponent, list3);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                        groupComponent.setClipPathData(list3);
                                    }
                                });
                                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                f15 = f11;
                                f16 = f14;
                                f17 = f12;
                                f18 = f13;
                                f19 = f9;
                                str3 = str2;
                                list2 = emptyPath;
                                f20 = f10;
                                f21 = f8;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i20) {
                                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                                }
                            });
                        }
                        i17 = C.ENCODING_PCM_32BIT;
                        i3 |= i17;
                        if (((~i2) & 256) != 0) {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl2, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl2, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        } else {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl3, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl3, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                            }
                        });
                    }
                    i3 |= 24576;
                    f9 = f4;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f7)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                        }
                        if (((~i2) & 256) != 0) {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl4, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl4, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        } else {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl5, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl5, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                            }
                        });
                    }
                    i17 = C.ENCODING_PCM_32BIT;
                    i3 |= i17;
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl6, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl6, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl7, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl7, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 3072;
                f8 = f3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        f9 = f4;
                        if (composerStartRestartGroup.changed(f9)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f7)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                        }
                        if (((~i2) & 256) != 0) {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl8 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl8, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl8, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        } else {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl9 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl9, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl9, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                            }
                        });
                    }
                    i17 = C.ENCODING_PCM_32BIT;
                    i3 |= i17;
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl10 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl10, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl10, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl11 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                f9 = f4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl12 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl12, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl12, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl13 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl13, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl13, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i17 = C.ENCODING_PCM_32BIT;
                i3 |= i17;
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl14 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl14, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl14, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl15 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl15, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl15, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 384;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    f8 = f3;
                    if (composerStartRestartGroup.changed(f8)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        f9 = f4;
                        if (composerStartRestartGroup.changed(f9)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f7)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                        }
                        if (((~i2) & 256) != 0) {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl16 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl16, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl16, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        } else {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl17 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl17, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl17, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                            }
                        });
                    }
                    i17 = C.ENCODING_PCM_32BIT;
                    i3 |= i17;
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl18 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl18, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl18, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl19 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl19, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl19, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                f9 = f4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl110 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl111 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i17 = C.ENCODING_PCM_32BIT;
                i3 |= i17;
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl113, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl113, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            f8 = f3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    f9 = f4;
                    if (composerStartRestartGroup.changed(f9)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl114 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl114, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl114, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl115 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl115, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl115, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i17 = C.ENCODING_PCM_32BIT;
                i3 |= i17;
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl116 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl116, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl116, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl117 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl117, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl117, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            f9 = f4;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl118 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl118, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl118, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl119 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl119, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl119, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i17 = C.ENCODING_PCM_32BIT;
            i3 |= i17;
            if (((~i2) & 256) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl1110 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl1111 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    f8 = f3;
                    if (composerStartRestartGroup.changed(f8)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        f9 = f4;
                        if (composerStartRestartGroup.changed(f9)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f7)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & 256;
                    if (i16 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changed(function2)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                        }
                        if (((~i2) & 256) != 0) {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl1112 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl1112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        } else {
                            if ((i & 1) != 0) {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = f2;
                                }
                                if (i6 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f9 = 1.0f;
                                }
                                if (i10 == 0) {
                                }
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                if (i14 == 0) {
                                }
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                } else {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-2103248778);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM899constructorimpl1113 = Updater.m899constructorimpl(composerStartRestartGroup);
                            Updater.m906setimpl(composerM899constructorimpl1113, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                    invoke2(groupComponent, str4);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                    groupComponent.setName(str4);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setRotation(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setPivotY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setScaleY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationX(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                    invoke(groupComponent, f22.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                    groupComponent.setTranslationY(f22);
                                }
                            });
                            Updater.m906setimpl(composerM899constructorimpl1113, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                    groupComponent.setClipPathData(list3);
                                }
                            });
                            composerStartRestartGroup.startReplaceableGroup(-1894407238);
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            f15 = f11;
                            f16 = f14;
                            f17 = f12;
                            f18 = f13;
                            f19 = f9;
                            str3 = str2;
                            list2 = emptyPath;
                            f20 = f10;
                            f21 = f8;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                            }
                        });
                    }
                    i17 = C.ENCODING_PCM_32BIT;
                    i3 |= i17;
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl1114 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1114, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1114, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl1115 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1115, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1115, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i3 |= 24576;
                f9 = f4;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl1116 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1116, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1116, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl1117 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl1117, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl1117, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i17 = C.ENCODING_PCM_32BIT;
                i3 |= i17;
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl1118 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl1118, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1118, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl1119 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl1119, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl1119, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            f8 = f3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    f9 = f4;
                    if (composerStartRestartGroup.changed(f9)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl11110 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl11111 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i17 = C.ENCODING_PCM_32BIT;
                i3 |= i17;
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl11112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl11113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11113, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11113, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            f9 = f4;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl11114 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11114, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11114, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl11115 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl11115, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl11115, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i17 = C.ENCODING_PCM_32BIT;
            i3 |= i17;
            if (((~i2) & 256) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl11116 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl11116, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11116, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl11117 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl11117, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl11117, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                f8 = f3;
                if (composerStartRestartGroup.changed(f8)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    f9 = f4;
                    if (composerStartRestartGroup.changed(f9)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i3 |= i15;
                }
                i16 = i2 & 256;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & 512) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changed(function2)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                    }
                    if (((~i2) & 256) != 0) {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl11118 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11118, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11118, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    } else {
                        if ((i & 1) != 0) {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f2;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                            if (i8 != 0) {
                                f9 = 1.0f;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                            composerStartRestartGroup.endDefaults();
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-2103248778);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM899constructorimpl11119 = Updater.m899constructorimpl(composerStartRestartGroup);
                        Updater.m906setimpl(composerM899constructorimpl11119, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                                groupComponent.setName(str4);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setRotation(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setPivotY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setScaleY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationX(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                                groupComponent.setTranslationY(f22);
                            }
                        });
                        Updater.m906setimpl(composerM899constructorimpl11119, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                                groupComponent.setClipPathData(list3);
                            }
                        });
                        composerStartRestartGroup.startReplaceableGroup(-1894407238);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        f15 = f11;
                        f16 = f14;
                        f17 = f12;
                        f18 = f13;
                        f19 = f9;
                        str3 = str2;
                        list2 = emptyPath;
                        f20 = f10;
                        f21 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                        }
                    });
                }
                i17 = C.ENCODING_PCM_32BIT;
                i3 |= i17;
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl111110 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl111111 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 24576;
            f9 = f4;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl111112 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl111113 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111113, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111113, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i17 = C.ENCODING_PCM_32BIT;
            i3 |= i17;
            if (((~i2) & 256) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl111114 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111114, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111114, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl111115 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111115, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111115, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        f8 = f3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                f9 = f4;
                if (composerStartRestartGroup.changed(f9)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i3 |= i15;
            }
            i16 = i2 & 256;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & 512) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changed(function2)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                }
                if (((~i2) & 256) != 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl111116 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111116, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111116, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if (i6 != 0) {
                            f8 = 0.0f;
                        }
                        if (i8 != 0) {
                            f9 = 1.0f;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                        composerStartRestartGroup.endDefaults();
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-2103248778);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM899constructorimpl111117 = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl111117, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                            invoke2(groupComponent, str4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                            groupComponent.setName(str4);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setRotation(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setPivotY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setScaleY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationX(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                            invoke(groupComponent, f22.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                            groupComponent.setTranslationY(f22);
                        }
                    });
                    Updater.m906setimpl(composerM899constructorimpl111117, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                            groupComponent.setClipPathData(list3);
                        }
                    });
                    composerStartRestartGroup.startReplaceableGroup(-1894407238);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    f15 = f11;
                    f16 = f14;
                    f17 = f12;
                    f18 = f13;
                    f19 = f9;
                    str3 = str2;
                    list2 = emptyPath;
                    f20 = f10;
                    f21 = f8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                    }
                });
            }
            i17 = C.ENCODING_PCM_32BIT;
            i3 |= i17;
            if (((~i2) & 256) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl111118 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111118, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111118, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl111119 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl111119, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl111119, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 24576;
        f9 = f4;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(f5)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        i14 = i2 & 128;
        if (i14 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f7)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i3 |= i15;
        }
        i16 = i2 & 256;
        if (i16 != 0) {
            i3 |= 33554432;
        }
        if ((i2 & 512) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changed(function2)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
            }
            if (((~i2) & 256) != 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl1111110 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if (i6 != 0) {
                        f8 = 0.0f;
                    }
                    if (i8 != 0) {
                        f9 = 1.0f;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                    composerStartRestartGroup.endDefaults();
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-2103248778);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM899constructorimpl1111111 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl1111111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                        invoke2(groupComponent, str4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                        groupComponent.setName(str4);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setRotation(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setPivotY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setScaleY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationX(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                        invoke(groupComponent, f22.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                        groupComponent.setTranslationY(f22);
                    }
                });
                Updater.m906setimpl(composerM899constructorimpl1111111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                        groupComponent.setClipPathData(list3);
                    }
                });
                composerStartRestartGroup.startReplaceableGroup(-1894407238);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                f15 = f11;
                f16 = f14;
                f17 = f12;
                f18 = f13;
                f19 = f9;
                str3 = str2;
                list2 = emptyPath;
                f20 = f10;
                f21 = f8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
                }
            });
        }
        i17 = C.ENCODING_PCM_32BIT;
        i3 |= i17;
        if (((~i2) & 256) != 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f2;
                }
                if (i6 != 0) {
                    f8 = 0.0f;
                }
                if (i8 != 0) {
                    f9 = 1.0f;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f2;
                }
                if (i6 != 0) {
                    f8 = 0.0f;
                }
                if (i8 != 0) {
                    f9 = 1.0f;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
                composerStartRestartGroup.endDefaults();
            }
            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final GroupComponent invoke() {
                    return new GroupComponent();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-2103248778);
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM899constructorimpl1111112 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl1111112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                    invoke2(groupComponent, str4);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                    groupComponent.setName(str4);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setRotation(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setPivotX(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setPivotY(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setScaleX(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setScaleY(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setTranslationX(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setTranslationY(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                    invoke2(groupComponent, list3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                    groupComponent.setClipPathData(list3);
                }
            });
            composerStartRestartGroup.startReplaceableGroup(-1894407238);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            f15 = f11;
            f16 = f14;
            f17 = f12;
            f18 = f13;
            f19 = f9;
            str3 = str2;
            list2 = emptyPath;
            f20 = f10;
            f21 = f8;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f2;
                }
                if (i6 != 0) {
                    f8 = 0.0f;
                }
                if (i8 != 0) {
                    f9 = 1.0f;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
                composerStartRestartGroup.endDefaults();
            } else {
                composerStartRestartGroup.startDefaults();
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f2;
                }
                if (i6 != 0) {
                    f8 = 0.0f;
                }
                if (i8 != 0) {
                    f9 = 1.0f;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
                composerStartRestartGroup.endDefaults();
            }
            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final GroupComponent invoke() {
                    return new GroupComponent();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-2103248778);
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM899constructorimpl1111113 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl1111113, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                    invoke2(groupComponent, str4);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull String str4) {
                    groupComponent.setName(str4);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setRotation(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setPivotX(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setPivotY(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setScaleX(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setScaleY(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setTranslationX(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                    invoke(groupComponent, f22.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent groupComponent, float f22) {
                    groupComponent.setTranslationY(f22);
                }
            });
            Updater.m906setimpl(composerM899constructorimpl1111113, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                    invoke2(groupComponent, list3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent groupComponent, @NotNull List<? extends PathNode> list3) {
                    groupComponent.setClipPathData(list3);
                }
            });
            composerStartRestartGroup.startReplaceableGroup(-1894407238);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            f15 = f11;
            f16 = f14;
            f17 = f12;
            f18 = f13;
            f19 = f9;
            str3 = str2;
            list2 = emptyPath;
            f20 = f10;
            f21 = f8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i20) {
                VectorComposeKt.Group(str3, f20, f15, f21, f19, f17, f18, f16, list2, function2, composer2, i | 1, i2);
            }
        });
    }

    @Composable
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m1704Path9cdaXJ4(@NotNull final List<? extends PathNode> list, int i, @Nullable String str, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        Composer composerStartRestartGroup = composer.startRestartGroup(435826864);
        final int defaultFillType = (i6 & 2) != 0 ? VectorKt.getDefaultFillType() : i;
        final String str2 = (i6 & 4) != 0 ? "" : str;
        Brush brush3 = (i6 & 8) != 0 ? null : brush;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        Brush brush4 = (i6 & 32) != 0 ? null : brush2;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i6 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i6 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f11 = (i6 & 1024) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        composerStartRestartGroup.startReplaceableGroup(-2103251527);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, str2, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str3) {
                invoke2(pathComponent, str3);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @NotNull String str3) {
                pathComponent.setName(str3);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                invoke2(pathComponent, list2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @NotNull List<? extends PathNode> list2) {
                pathComponent.setPathData(list2);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, PathFillType.m1417boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m1706invokepweu1eQ(pathComponent, pathFillType.getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m1706invokepweu1eQ(@NotNull PathComponent pathComponent, int i7) {
                pathComponent.m1686setPathFillTypeoQ8Xj4U(i7);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @Nullable Brush brush5) {
                pathComponent.setFill(brush5);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setFillAlpha(f15);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent pathComponent, @Nullable Brush brush5) {
                pathComponent.setStroke(brush5);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f9), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setStrokeAlpha(f15);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f10), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setStrokeLineWidth(f15);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, StrokeJoin.m1484boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m1707invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m1707invokekLtJ_vA(@NotNull PathComponent pathComponent, int i7) {
                pathComponent.m1688setStrokeLineJoinWw9F2mQ(i7);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, StrokeCap.m1474boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m1705invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m1705invokeCSYIeUk(@NotNull PathComponent pathComponent, int i7) {
                pathComponent.m1687setStrokeLineCapBeK7IIE(i7);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f11), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setStrokeLineMiter(f15);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f12), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathStart(f15);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f13), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathEnd(f15);
            }
        });
        Updater.m906setimpl(composerM899constructorimpl, Float.valueOf(f14), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent pathComponent, float f15) {
                pathComponent.setTrimPathOffset(f15);
            }
        });
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Brush brush5 = brush3;
        final float f15 = f8;
        final Brush brush6 = brush4;
        final float f16 = f9;
        final float f17 = f10;
        final int i7 = defaultStrokeLineCap;
        final int i8 = defaultStrokeLineJoin;
        final float f18 = f11;
        final float f19 = f12;
        final float f20 = f13;
        final float f21 = f14;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i9) {
                VectorComposeKt.m1704Path9cdaXJ4(list, defaultFillType, str2, brush5, f15, brush6, f16, f17, i7, i8, f18, f19, f20, f21, composer2, i4 | 1, i5, i6);
            }
        });
    }
}
