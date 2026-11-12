package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00109\u001a\u000208¢\u0006\u0004\b;\u0010<J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u00032\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\rH\u0002J\u001b\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010'\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010*\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010/\u001a\u00020.8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "apply", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "commandExecutionContext", "", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "Z", "getEditable", "()Z", "singleLine", "getSingleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/KeyMapping;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public final class TextFieldKeyInput {
    private final boolean editable;

    @NotNull
    private final KeyMapping keyMapping;

    @NotNull
    private final OffsetMapping offsetMapping;

    @NotNull
    private final TextPreparedSelectionState preparedSelectionState;

    @NotNull
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;

    @NotNull
    private final TextFieldState state;

    @Nullable
    private final UndoManager undoManager;

    @NotNull
    private final TextFieldValue value;

    public TextFieldKeyInput(@NotNull TextFieldState textFieldState, @NotNull TextFieldSelectionManager textFieldSelectionManager, @NotNull TextFieldValue textFieldValue, boolean z, boolean z2, @NotNull TextPreparedSelectionState textPreparedSelectionState, @NotNull OffsetMapping offsetMapping, @Nullable UndoManager undoManager, @NotNull KeyMapping keyMapping) {
        this.state = textFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyMapping = keyMapping;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        this.state.getOnValueChange().invoke(this.state.getProcessor().apply(CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), editCommand})));
    }

    private final void commandExecutionContext(Function1<? super TextFieldPreparedSelection, Unit> block) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (TextRange.m2717equalsimpl0(textFieldPreparedSelection.getSelection(), this.value.getSelection()) && Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.state.getOnValueChange().invoke(textFieldPreparedSelection.getValue());
    }

    /* JADX INFO: renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m471typedCommandZmokQxo(KeyEvent event) {
        if (TextFieldKeyInput_androidKt.m474isTypedEventZmokQxo(event)) {
            return new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), KeyEvent_androidKt.m2330getUtf16CodePointZmokQxo(event)).toString(), 1);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @NotNull
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @NotNull
    public final TextFieldState getState() {
        return this.state;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m472processZmokQxo(@NotNull KeyEvent event) {
        final KeyCommand keyCommandMo419mapZmokQxo;
        CommitTextCommand commitTextCommandM471typedCommandZmokQxo = m471typedCommandZmokQxo(event);
        if (commitTextCommandM471typedCommandZmokQxo != null) {
            if (!getEditable()) {
                return false;
            }
            apply(commitTextCommandM471typedCommandZmokQxo);
            getPreparedSelectionState().resetCachedX();
            return true;
        }
        if (!KeyEventType.m2321equalsimpl0(KeyEvent_androidKt.m2329getTypeZmokQxo(event), KeyEventType.INSTANCE.m2325getKeyDownCS__XNY()) || (keyCommandMo419mapZmokQxo = this.keyMapping.mo419mapZmokQxo(event)) == null || (keyCommandMo419mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        commandExecutionContext(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    iArr[KeyCommand.COPY.ordinal()] = 1;
                    iArr[KeyCommand.PASTE.ordinal()] = 2;
                    iArr[KeyCommand.CUT.ordinal()] = 3;
                    iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    iArr[KeyCommand.UP.ordinal()] = 10;
                    iArr[KeyCommand.DOWN.ordinal()] = 11;
                    iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    iArr[KeyCommand.HOME.ordinal()] = 18;
                    iArr[KeyCommand.END.ordinal()] = 19;
                    iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    iArr[KeyCommand.TAB.ordinal()] = 27;
                    iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    iArr[KeyCommand.UNDO.ordinal()] = 46;
                    iArr[KeyCommand.REDO.ordinal()] = 47;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                invoke2(textFieldPreparedSelection);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection) {
                TextFieldValue textFieldValueUndo;
                TextFieldValue textFieldValueRedo;
                switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo419mapZmokQxo.ordinal()]) {
                    case 1:
                        this.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        this.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        this.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        textFieldPreparedSelection.collapseLeftOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorLeft();
                            }
                        });
                        break;
                    case 5:
                        textFieldPreparedSelection.collapseRightOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorRight();
                            }
                        });
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorLeftByWord();
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorRightByWord();
                        break;
                    case 8:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        break;
                    case 10:
                        textFieldPreparedSelection.moveCursorUpByLine();
                        break;
                    case 11:
                        textFieldPreparedSelection.moveCursorDownByLine();
                        break;
                    case 12:
                        textFieldPreparedSelection.moveCursorUpByPage();
                        break;
                    case 13:
                        textFieldPreparedSelection.moveCursorDownByPage();
                        break;
                    case 14:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        break;
                    case 15:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        break;
                    case 16:
                        textFieldPreparedSelection.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        textFieldPreparedSelection.moveCursorToLineRightSide();
                        break;
                    case 18:
                        textFieldPreparedSelection.moveCursorToHome();
                        break;
                    case 19:
                        textFieldPreparedSelection.moveCursorToEnd();
                        break;
                    case 20:
                        textFieldPreparedSelection.deleteIfSelectedOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorPrev().selectMovement().deleteSelected();
                            }
                        });
                        break;
                    case 21:
                        textFieldPreparedSelection.deleteIfSelectedOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorNext().selectMovement().deleteSelected();
                            }
                        });
                        break;
                    case 22:
                        textFieldPreparedSelection.deleteIfSelectedOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorPrevByWord().selectMovement().deleteSelected();
                            }
                        });
                        break;
                    case 23:
                        textFieldPreparedSelection.deleteIfSelectedOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorNextByWord().selectMovement().deleteSelected();
                            }
                        });
                        break;
                    case 24:
                        textFieldPreparedSelection.deleteIfSelectedOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorToLineStart().selectMovement().deleteSelected();
                            }
                        });
                        break;
                    case 25:
                        textFieldPreparedSelection.deleteIfSelectedOr(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorToLineEnd().selectMovement().deleteSelected();
                            }
                        });
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\n", 1));
                        } else {
                            booleanRef.element = false;
                        }
                        break;
                    case 27:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand(HTTP.TAB, 1));
                        } else {
                            booleanRef.element = false;
                        }
                        break;
                    case 28:
                        textFieldPreparedSelection.selectAll();
                        break;
                    case 29:
                        textFieldPreparedSelection.moveCursorLeft().selectMovement();
                        break;
                    case 30:
                        textFieldPreparedSelection.moveCursorRight().selectMovement();
                        break;
                    case 31:
                        textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                        break;
                    case 32:
                        textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                        break;
                    case 33:
                        textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                        break;
                    case 34:
                        textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                        break;
                    case 35:
                        textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                        break;
                    case 36:
                        textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                        break;
                    case 37:
                        textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                        break;
                    case 38:
                        textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                        break;
                    case 39:
                        textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                        break;
                    case 40:
                        textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                        break;
                    case 41:
                        textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                        break;
                    case 42:
                        textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                        break;
                    case 43:
                        textFieldPreparedSelection.moveCursorToHome().selectMovement();
                        break;
                    case 44:
                        textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                        break;
                    case 45:
                        textFieldPreparedSelection.deselect();
                        break;
                    case 46:
                        UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                        }
                        UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (textFieldValueUndo = undoManager2.undo()) != null) {
                            this.getState().getOnValueChange().invoke(textFieldValueUndo);
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (textFieldValueRedo = undoManager3.redo()) != null) {
                            this.getState().getOnValueChange().invoke(textFieldValueRedo);
                        }
                        break;
                }
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return booleanRef.element;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, KeyMapping keyMapping, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, textPreparedSelectionState, (i & 64) != 0 ? OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i & 128) != 0 ? null : undoManager, (i & 256) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping);
    }
}
