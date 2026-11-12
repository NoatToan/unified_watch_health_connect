package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000ø\u0001\u0000\"\u001c\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m2332isCtrlPressedZmokQxo(((KeyEvent) obj).m2317unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo419mapZmokQxo(@NotNull android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2334isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2332isCtrlPressedZmokQxo(event)) {
                    long jM2328getKeyZmokQxo = KeyEvent_androidKt.m2328getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m438getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m439getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m440getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m437getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2332isCtrlPressedZmokQxo(event)) {
                    long jM2328getKeyZmokQxo2 = KeyEvent_androidKt.m2328getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m438getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m439getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m440getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m437getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m442getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m436getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m433getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m432getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2334isShiftPressedZmokQxo(event)) {
                    long jM2328getKeyZmokQxo3 = KeyEvent_androidKt.m2328getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m445getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m444getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo419mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo419mapZmokQxo(@NotNull android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m2311boximpl(event)).booleanValue() && KeyEvent_androidKt.m2334isShiftPressedZmokQxo(event)) {
                    if (Key.m1733equalsimpl0(KeyEvent_androidKt.m2328getKeyZmokQxo(event), MappedKeys.INSTANCE.m452getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m2311boximpl(event)).booleanValue()) {
                    long jM2328getKeyZmokQxo = KeyEvent_androidKt.m2328getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m434getCEK5gGoQ()) ? true : Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m443getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m450getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m451getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m431getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo, mappedKeys.m452getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m2332isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m2334isShiftPressedZmokQxo(event)) {
                    long jM2328getKeyZmokQxo2 = KeyEvent_androidKt.m2328getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m438getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m439getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m440getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m437getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m447getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m446getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m445getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m444getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo2, mappedKeys2.m443getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM2328getKeyZmokQxo3 = KeyEvent_androidKt.m2328getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m438getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m439getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m440getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m437getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m447getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m446getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m445getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m444getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m441getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m433getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m436getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m448getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m435getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m1733equalsimpl0(jM2328getKeyZmokQxo3, mappedKeys3.m449getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
