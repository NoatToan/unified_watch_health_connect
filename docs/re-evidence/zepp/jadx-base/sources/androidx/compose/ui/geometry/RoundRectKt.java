package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a#\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u001b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0000\"\u0017\u0010\"\u001a\u00020\r*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0017\u0010$\u001a\u00020\r*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0017\u0010&\u001a\u00020%*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0017\u0010(\u001a\u00020%*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010'\"\u0017\u0010)\u001a\u00020%*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010'\"\u0017\u0010*\u001a\u00020%*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010'\"\u0017\u0010+\u001a\u00020%*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010'\"\u0017\u0010.\u001a\u00020\u0000*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0017\u00100\u001a\u00020\u0000*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010-\"\u001a\u00103\u001a\u00020\u0017*\u00020\u00078F@\u0006ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00104\u001a\u00020%*\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b4\u0010'\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Landroidx/compose/ui/geometry/RoundRect;", "RoundRect", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/Rect;", "rect", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/Offset;", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", VoiceConfigFuncKt.TRANSLATE, "start", Command.STOP, "fraction", "lerp", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "boundingRect", "getSafeInnerRect", "safeInnerRect", "", "isEmpty", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isFinite", "isRect", "isEllipse", "isCircle", "getMinDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMaxDimension", "maxDimension", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", b.m0, "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 5, 1})
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m1035RoundRectZAM2FJo(@NotNull Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m1037RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m958getXimpl(j), CornerRadius.m959getYimpl(j));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m1038RoundRectsniSvfs(@NotNull Rect rect, long j) {
        return RoundRect(rect, CornerRadius.m958getXimpl(j), CornerRadius.m959getYimpl(j));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()), CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        return ((roundRect.getWidth() > roundRect.getHeight() ? 1 : (roundRect.getWidth() == roundRect.getHeight() ? 0 : -1)) == 0) && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs())) {
            if (CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs())) {
                            if ((CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs())) && roundRect.getWidth() <= ((double) CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs())) * 2.0d && roundRect.getHeight() <= ((double) CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs())) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        float left = roundRect.getLeft();
        if ((Float.isInfinite(left) || Float.isNaN(left)) ? false : true) {
            float top = roundRect.getTop();
            if ((Float.isInfinite(top) || Float.isNaN(top)) ? false : true) {
                float right = roundRect.getRight();
                if ((Float.isInfinite(right) || Float.isNaN(right)) ? false : true) {
                    float bottom = roundRect.getBottom();
                    if ((Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final boolean isRect(@NotNull RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == 0.0f) {
            if (CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return true;
                    }
                    if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return true;
                    }
                } else {
                    if (CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return true;
                        }
                        if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return true;
                        }
                    }
                }
            } else {
                if (CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return true;
                        }
                        if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return true;
                        }
                    } else {
                        if (CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                return true;
                            }
                            if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == 0.0f) {
                if (CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return true;
                        }
                        if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return true;
                        }
                    } else {
                        if (CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                return true;
                            }
                            if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return true;
                            }
                        }
                    }
                } else {
                    if (CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                return true;
                            }
                            if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return true;
                            }
                        } else {
                            if (CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    return true;
                                }
                                if (CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs())) {
            if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m958getXimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1034getTopRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m958getXimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1032getBottomRightCornerRadiuskKHJgLs())) {
                            if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m958getXimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs())) {
                                if (CornerRadius.m958getXimpl(roundRect.m1033getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m959getYimpl(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect roundRect, @NotNull RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m969lerp3Ry4LBc(roundRect.m1033getTopLeftCornerRadiuskKHJgLs(), roundRect2.m1033getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m969lerp3Ry4LBc(roundRect.m1034getTopRightCornerRadiuskKHJgLs(), roundRect2.m1034getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m969lerp3Ry4LBc(roundRect.m1032getBottomRightCornerRadiuskKHJgLs(), roundRect2.m1032getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m969lerp3Ry4LBc(roundRect.m1031getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m1031getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    @NotNull
    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m1039translateUv8p0NA(@NotNull RoundRect roundRect, long j) {
        return new RoundRect(Offset.m983getXimpl(j) + roundRect.getLeft(), Offset.m984getYimpl(j) + roundRect.getTop(), Offset.m983getXimpl(j) + roundRect.getRight(), Offset.m984getYimpl(j) + roundRect.getBottom(), roundRect.m1033getTopLeftCornerRadiuskKHJgLs(), roundRect.m1034getTopRightCornerRadiuskKHJgLs(), roundRect.m1032getBottomRightCornerRadiuskKHJgLs(), roundRect.m1031getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
