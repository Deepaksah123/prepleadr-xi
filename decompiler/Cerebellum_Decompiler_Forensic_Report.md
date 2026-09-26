# Cerebellum APK Decompiler.com Forensic Pass

Source: `base (1).apk_Decompiler.com.zip`
ZIP size: 104,477,964 bytes
Entries: 46,647
Bundle size: 11,206,868 bytes
Application ID: `com.cerebellummobileapp`
Version: `1.16.2` (versionCode 172)
React Native component: `cerebellumMobileApp`
Hermes: enabled
New Architecture: enabled

## What this decompiler package adds

This package is materially more useful than a plain APK extraction because it contains:
- decoded `AndroidManifest.xml`
- 22k+ smali files
- JADX-style `sources/`
- decoded Android resources
- the original `resources/assets/index.android.bundle`
- app-specific drawable assets

The React Native UI itself is still compiled into the Hermes bundle; the package does **not** contain the original TypeScript/JSX source files.

## Native app facts

- Main activity: `com.cerebellummobileapp.MainActivity`
- Main RN component: `cerebellumMobileApp`
- Picture-in-picture video support is implemented natively.
- Manifest target SDK 36 / min SDK 26.
- App is `resizeableActivity=true` and screen orientation is `unspecified`.
- `android:usesCleartextTraffic=true`.
- API/UI layer is therefore primarily React Native/Hermes, not native XML layouts.

## Recovered app-owned image inventory

| Asset | px | Mode | ZIP bytes | SHA256 prefix |
|---|---:|---|---:|---|
| `backiconmask.png` | 50×85 | LA | 722 | `41aee4807ed28e72` |
| `images_accouncements_1.webp` | 110×96 | RGBA | 6,308 | `3f0afc8f74942e31` |
| `images_accouncements_2.webp` | 110×96 | RGBA | 6,158 | `cd99ec73cfba56bf` |
| `images_accouncements_3.webp` | 107×96 | RGBA | 5,352 | `4d5b1d24800dcd7d` |
| `images_bottom_share.webp` | 322×328 | RGBA | 14,894 | `68282bbac034ec30` |
| `images_bugimg.webp` | 64×64 | RGBA | 638 | `5180800c00d41bea` |
| `images_campprogress.webp` | 129×129 | RGBA | 1,470 | `3bad27d22db58143` |
| `images_cerebellumbulb.webp` | 334×506 | RGB | 22,272 | `f9476997624536f9` |
| `images_cerebellumtransparent.webp` | 24×46 | RGBA | 1,390 | `45e90a5126d5af1c` |
| `images_custommodule_allquestions.webp` | 357×334 | RGBA | 10,370 | `d1e3941dbf1c940e` |
| `images_custommodule_grandtestquestions.webp` | 365×313 | RGBA | 14,628 | `67f5d476d849113e` |
| `images_custommodule_previousyearquestions.webp` | 357×318 | RGBA | 18,560 | `5451752accb4fd16` |
| `images_custommodule_qbankquestions.webp` | 373×306 | RGBA | 15,218 | `a806b7a70f9f53c3` |
| `images_defaultuserprofile.png` | 560×560 | P | 3,477 | `3cffdf7a060da722` |
| `images_duration.webp` | 19×21 | RGBA | 522 | `aa2ca9a2fd632abe` |
| `images_heroimg_homepage.webp` | 274×332 | RGBA | 29,822 | `1484aeaf4a3d40df` |
| `images_homecerebellumicon.webp` | 73×139 | RGBA | 2,412 | `e74a8de06a7d0deb` |
| `images_homepage_1.webp` | 750×444 | RGB | 32,826 | `16f697a494214226` |
| `images_homepage_2.webp` | 349×187 | RGBA | 22,784 | `0b6d2b4dd557f4f4` |
| `images_homepage_3.webp` | 349×187 | RGBA | 25,900 | `8d66020458f09097` |
| `images_homepage_bottom.webp` | 375×194 | RGB | 212 | `d2b53fc9acb8cc9a` |
| `images_homepagecarousal1.webp` | 512×680 | RGBA | 19,600 | `35b0be4d37ad7920` |
| `images_homesolidcerebellum.webp` | 73×139 | RGBA | 3,608 | `e269681c22bc4ffe` |
| `images_image.webp` | 1096×1824 | RGBA | 66,712 | `cc520922568adc9d` |
| `images_image1.webp` | 480×320 | RGB | 49,582 | `90deb8f0de5d6c6c` |
| `images_image2.webp` | 480×360 | RGB | 54,248 | `a5bf8c5a80cf94c7` |
| `images_image3.webp` | 322×479 | RGB | 52,286 | `3bbdc4c91b2345c6` |
| `images_image4.webp` | 480×320 | RGB | 73,992 | `3ea50009520502dc` |
| `images_image5.webp` | 480×320 | RGB | 33,344 | `b36298d9070744b2` |
| `images_invitefriends.gif` | 150×150 | P | 235,881 | `a7bbc1c19c714132` |
| `images_language.webp` | 20×18 | RGBA | 508 | `572d485528e52d3d` |
| `images_language_2.webp` | 375×375 | RGBA | 4,844 | `116f8b28fe4efd85` |
| `images_laurelwreath.png` | 122×87 | P | 1,978 | `c65ecf21ea8b774a` |
| `images_leaderboardplaceholder.png` | 96×96 | RGBA | 3,682 | `395576b4e872f95a` |
| `images_learnfrombest.png` | 358×468 | RGBA | 80,236 | `0ad427006176c032` |
| `images_liveicon.webp` | 1828×624 | RGB | 19,584 | `f50e37477d73acc3` |
| `images_liveindicator.gif` | 640×640 | P | 189,546 | `fa05c7e4655ac990` |
| `images_lockedgraph.png` | 632×210 | RGBA | 48,325 | `216dbe04d7b55f20` |
| `images_logo.webp` | 2000×2000 | RGB | 116,292 | `3b2d2951bed7add3` |
| `images_mail.webp` | 86×88 | RGBA | 2,030 | `ded906b9422ba241` |
| `images_marketheroimg.webp` | 750×1238 | RGBA | 192,636 | `1988eb5c0d445f01` |
| `images_marks.webp` | 20×20 | RGBA | 554 | `ce74553ae2aaf0e8` |
| `images_masteryourpassion.png` | 475×600 | RGBA | 125,801 | `b33abf01578c972f` |
| `images_message_telephone.webp` | 740×741 | RGB | 26,134 | `f3e36178b269c7f1` |
| `images_notesicon.webp` | 54×49 | RGBA | 548 | `d2f7c63f8a274e20` |
| `images_notesoverlay.webp` | 537×871 | RGBA | 197,324 | `7731f3c3ec8e2a9c` |
| `images_paymentsuccess.gif` | 150×150 | P | 39,033 | `c1946b4a667c1efe` |
| `images_personalizedlearning.png` | 475×600 | RGBA | 82,716 | `d087a0321f50ccde` |
| `images_planspage_events_illustration.webp` | 385×410 | RGBA | 11,392 | `82d25e975d07882a` |
| `images_planspage_extension_illustration.webp` | 2000×2000 | RGBA | 69,358 | `4dedff5f5df07c48` |
| `images_planspage_notes_illustration.webp` | 393×407 | RGBA | 20,866 | `5650265817f53c48` |
| `images_planspage_overlay_bg.webp` | 375×197 | RGBA | 15,802 | `8ccbdc9d41e296b8` |
| `images_planspage_plans_illustration.webp` | 360×379 | RGBA | 20,520 | `b6946ce3b5b0b8a5` |
| `images_preventscreen.jpeg` | 1440×2949 | RGB | 62,677 | `a0ebca7baefac327` |
| `images_profilecardbg.png` | 1800×1200 | RGB | 944,571 | `c8ada10d62871f5a` |
| `images_question.webp` | 20×20 | RGBA | 576 | `b95ec3967ca07368` |
| `images_rankimg.webp` | 502×418 | RGB | 21,824 | `beb7b5a2c9f2c2a4` |
| `images_samplecoverimage.webp` | 375×200 | RGB | 19,444 | `da4137a6afaa9aeb` |
| `images_shortnotespaidcontent.webp` | 1084×1596 | RGBA | 241,088 | `dffc9318cb8b2f1d` |
| `images_subjectdetailbackground.webp` | 375×240 | RGBA | 6,812 | `955c3ef2ece84cdf` |
| `images_subscription.webp` | 2000×2000 | RGB | 78,670 | `e43bb169bf261400` |
| `images_subscriptionbg.png` | 1170×570 | RGB | 528,000 | `55287dc537f22543` |
| `images_telephone.webp` | 740×741 | RGB | 19,992 | `6874d5644e5511c3` |
| `images_transparentlogo.webp` | 2000×2000 | RGBA | 64,660 | `9aaa487bc3948f6d` |
| `images_videoicon.webp` | 64×47 | RGBA | 918 | `d5c0f699e024b0d6` |
| `images_whatsapp.webp` | 86×88 | RGBA | 3,016 | `05ef411dbcc53c01` |
| `svgicons_livesectiongif.gif` | 150×150 | P | 70,804 | `b2cd2b8329be143d` |

## UI/component/route evidence from Hermes bundle

### `HomePage`
```text
ceOneSemibold text-[14px] text-primary-dark mb-2!text-xs !text-blue-500 0 21 18.0.0-alpha-b-box-outlinextBytest_window_duration-200(app)" but; filename=" is not in the SourceMap../HomePage/api-offill-background-500/75+591.67%3DES-ECBad segment " must contain an index to the tuple element, e.g. " contains characters other than [A-Z0-9.-:_] and Punycode.js is not available in the build-sharpail-minus-outline#e6f3feFuncAES-256-CBCan't star
```
### `CustomModule`
```text
r than [A-Z0-9.+-] or doesn't start with [A-Z]#F45E231A maximum of 1 download can be queued at once. Please wait for the current downloads to finish before adding more componentscyCustomModuleBookmark to review in the exam's final daysInMonthirdLastIndexOfill-info-300/95Micronesia, Estados Federados decorator cannot be used without the `@realm/babel-plugin` Babel plugin. Please check that you have installed and configured the Babel plug
```
```text
imeline-clock-outlineFacing issues in App,
            playsinline: 1,
            loop: have imported it in your project, and have rebuilt your native application../../../screens/CustomModule/typeslint-plugin-reanimatedDummyReanimatedModuleProxy,
            rel: have imported it in your project../../../utils/NavigationRoutest-tube-empty#FF6B3Ensure the app provided is the default Firebase app only and not the ", "hex"), Number(size) |
```
```text
5 64 64+266+267+268+269+27 50 36+290+2915b94333546558362095734fae852corrupted array bsonDecrementToMins/QuescapeRegExclusive tests must provide a unique `name` identifying the testCustomModuleAnalysisConstructor was not registered in the schema for this Realm is closed-caption-disabledPinCodeContainerStyle+297+298+299+30+31.2.840.113549.2.2+32.5.29.8+33+345+350+351 51 51+352 131 82+353+354+35525aaa28ec0d2a9eb75113f1a91690+356+357+358+35
```
```text
ege/chapter-video-detail/bookmarked-test-info/bookmarked-question-units/assets/src/assets/svgIconsole.level_endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-
```
```text
7215afc6de606d6b$export$de79e2c695e052f39faa759ce3c59ebd4ab8afcd8b592^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$cdc5a6778b766db2$export$a9d04c5684123369745d4a4a6fa62fa0ed495f89aa964handleCustomModuleTagsSchemailCATransform3DES-CTRADELIVERED_50h-[56px] w-[42%] bg-customGray-90 items-center justify-center rounded-xlogInWithAnonymouseupdateEmail()flex-row items-center mb-3 p-3 border border-gray-200 rounded-xl p-[14px]  bg-white mb-8 md:w-[48%] m
```
### `ChapterList`
```text
t with an animated view and apply the layout animation on the wrapper.FLASH_TOASTOP_PROPAGATION_FLAG_KEYour Accuracy - originated from the default application only../../../screens/ChapterList/apiRequest Header Fields Too LargetCpuArchair-school-sharpolygonToBindingGeospatial-trackingit-pull-request-closedwithExtraArgument passed in does not match the accepted typescapeCharddisk-pluseIMGElementStateWithCacheckmark-circle-sharpaper-plane-
```
```text
ew app version before delivering this OTA update.unstable_getCacheForTypestartShouldSetResponderesolveRelativeSizeshowMessagetCachedBundleIdsubMessagetCategorytopEnvironmentChangetChapterListenstainetopSelectionChangetClassGroupIdunZoomedImagetClientSignatureadInt8_getCloudFrontCookieHeadergetCollegeListHandleruserMessagetComponentNameForHostInstancewater-damagetComputedStyleLogBoxMessagetCrashHistorymakepropertiesValidatorshouldContinu
```
### `PlanList`
```text
n.android.chronometerDirection' must be one of "up" or "down". Expected a number, "ms", or "s". Expected a number between 0 and 1 or a percentage between 0% and 100%../app/screens/PlanList/apipeWitheatersaturationline-predictionormalizeIterationCountext-secondary-200/100Could not convert certificate from PEM; PEM header type is not "CERTIFICATE", "X509 CERTIFICATE", or "TRUSTED CERTIFICATE". Only numbers, percentages, "from", and "to" a
```
```text
2.54-3.257insetBottomTabBarItem54.84 58.466-9.208-2.31H34.367l-9.207 2.31a3.36 3.36 0 0 0-2.54 3.257V80h34.76V61.723a3.36 3.36 0 0 0-2.54-3.257border-xAxisIndicesWidthandleSelectedPlanListItem55.566 37.222-4.773 10.786v22.897a4.024 4.024 0 0 1-4.024 4.025H7.837v3.46c0 .89.72 1.61 1.61 1.61h46.367V37.061zRNSavedVideoItem56.33 10.786 1.512-2.692 7.976 4.483-1.512 2.692zReactContentLoaderInstagram57.69 11.551 1.513-2.692 5.251 2.95-1.513 2
```
### `QbankQuestions`
```text
 of ` for responder `setUpTests` is available only in Jest environment.Unsupported type BigInt, please use Decimal128 must take a Buffer of 16 bytes in length../../../realm/schema/QbankQuestions/actionsmidAxisLabelColoreactNativeReanimated_RotateTs1Factory[\s\r\n]|${path} is invalid array terminator bytes, expected ]]>_worklet_3196682962626_init_dataccessibilitySort bytes../../../realm/schema/TestAnalytics/actionsqsubeach-slipperformFul
```
```text
getImageSourceSyncachePoolabelBesidelayTimergeConfigstroke-tertiary-100/95unmountOnBlurlParselectNodeleteTimergeIdstroke-tertiary-200/0subpluseRenderStackBarscrollMarginTopolymergeQbankQuestionsAnswerstroke-tertiary-200/100setNativePropsDefaultelevision-shimmergeRefstroke-tertiary-200/25withReanimatedTimergeRemoteQBankAnnotationstroke-tertiary-200/30JaponyammergeTestsSessionstroke-tertiary-200/40_callTimergeUnitWithChapterIdstroke-terti
```
```text
wifi-removeNodeleteQBankAnnotationOutboxSchemagnet-sharpier-craneQUESTION_TYPE_WINDOW_STATE_CHANGEDcreateDeeplinkForQbankAnalyticsSchemagnify-close-box-multiple-outlinecommitDataddQbankQuestionsSchemagnify-minus-cursor-moveShouldSetRespondereactNativeReanimated_SlideTs3FactoryfetchQbankResultSchemagnify-minus-outlineQfrac35getQuestionIconRANK_RANGESKY_BLUE_100RCTBundleConsumercuryget RCTEventEmitterRDNAttributesAsArray-start-arrow-circl
```
```text
ationId[HotUpdater] setReloadBehavior('custom') requires a reload handler.fastAddPropertiesetRsaPublicKeyfetchPhysicalDimensionsetScreenBlurredfetchQbankDetailsetScreenFocusedfetchQbankQuestionsetScrollXfiber_renderer_arrayWithoutHolesetSecondaryPointerYfilterOutAnimatedStylesetSelectedIdxfilterOutLocationComponentFiltersetSelectedIndexfilterQuestionsetSelectedLineNumbereplaySuspendedUnitOfWorkfindAnimatedStylesetSelectedStackIndexflush
```
### `TestAnalytics`
```text
loreactNativeReanimated_RotateTs1Factory[\s\r\n]|${path} is invalid array terminator bytes, expected ]]>_worklet_3196682962626_init_dataccessibilitySort bytes../../../realm/schema/TestAnalytics/actionsqsubeach-slipperformFullRefreshestCRLVISITED_ROUTE_KEYSelect Videostroke-background-dark/40#887A24mpretty-format: Options "min" and "indent" cannot be used together.<span class=" is not supported for converting to UUID. Only " contains cha
```
```text
left-12 top-1/2 z-10 mb-2FLEXIBLEritreiabsolute top-[15%] -left-[2%] w-[110px] h-[15px] rounded-2 rotate-[115deg]flex-row gap-2 items-center mt-2 -ml-1vaping-roomscrollToXYourStatsTestAnalyticsTabsolute -top-1 left-1/2 -ml-2 z-20-moz-column-gap-0_deferred_buildAnimationsMapp-store-ios-share-alternativeStart Custom QBankIcontentWindow-16 h-16 rounded-md items-center justify-center bg-extras-blue10 pt-8 pb-6 px-4 -mt-10 justify-center fle
```
```text
nUnsupported platform: Unsupported protocol version.Unsupported symmetric cipher, OID Unsupported timing function: Unsupported top level event type "Unsupported version: isUpcomingTestAnalyticsSectionUNSAFE_componentWillUpdate Readyalog()__reactInternalSnapshotBeforeUpdate available_dispatchHotspotUpdate has already been triggered by the developer-board-offill-background-900/50_handleAnimatedStylesUpdate hook called on initial render. T
```
```text
900/20_cancelPressOutDelayTimeoutdatedImagesDimensionstroke-tertiary-900/25--color-warning-background-hoverlayPropstroke-tertiary-900/30flipBitstroke-tertiary-900/40forceFullDataddTestAnalyticsProjectConfigSchemaintainVisibleContentPositiono-backpackage-dependentstroke-tertiary-900/50bounceOutUpageNumberstroke-tertiary-900/60briefcase-sharpagelinestroke-tertiary-900/70JaapanGestureHandlerPropstroke-tertiary-900/80Uarrocircamera-sharpanH
```
```text
24cc-nameByTableKey_remoteMethodTableRef_get_primary_key_columnNumbereloadAndProfile-audio-o__getNativeTagSchemailchimpactHeavyTeacherSchemainVerbarrettMulTo_checkBufferLengthandleTestAnalyticsSchemakeElementVisibleisFromCreateCustomTestSchemakeFromCircleSymbolRendererupperCaselectedTextTrackTypeg$c0Tfrac56ThetabBarHideOnKeyboardclockTickIcontroller-volume-2_worklet_2691237213530_init_dataobao-squarecognizeSelfClosingetTimestamp_makeDef
```
### `Review`
```text
5, 255, 255, 1.0)'
  - 'hsl(360, 100%, 100%)'
  - 'hsla(360, 100%, 100%, 1.0)'
  - 'transparent'
  - 'red'
  - 0xff00ff00 (0xrrggbbaa)
  translateX((?:<|>)?=?)FlipInXDownotAnsweredReview Option 1: With HotUpdater.wrap()
  translateY(([+-]\d{2}(:?\d{2})?)|Z)<generated guard>Cannot set MAC key after calling updateQueueasingVALID_STEPS_MODIFIERSYNTAX_ERRNSBottomTabsScreen [invoke] onWillAppear receivedirections-fork-rightext-outline-500/10
```
```text
issing./parseLogBoxLogInWithAnonymousedowncircleoopfill-error-200/60Invalid session responseCallbackdrop-invertColorDidChangetExpires on what you just watchedgesensor-highLightTimeReviewTextractOpacityflex-row items-center gap-2 border-2 border-primary-blue bg-white rounded-xl py-2 px-4 flex-row items-center justify-between bg-primary-blue/10 p-4 rounded-lg  mx-2 md:mx-10 md:mb-8flex-row justify-between items-center px-4 pt-2 pb-3 px-4 
```
```text
r a guide on nesting.Wrong Answer Change Insightstroke-background-600/90topDrawerSlideInDownot_guessedAnswer SummaryCardsetExtensionstroke-warning-300/40bNot Answered & Marked for Review Cardstroke-background-950/90bnAndNot Answered Question removed from bookmarks-outlinewrong_answer_changed_incorrect_to_correctAnswers Changediamond-stoneAntarcticaStoreachabilityHeaderstroke-typography-600/30AntarctiquestionIdTextext-sm mb-4Antarktidail
```
```text
derEndbattery-4-barBorderTopLeftRadiuseCaptureProtectionListenergy-savings-leaf-maple-offill-background-warning/20Saudi-ArabiensureRevenueCatUserLoggedInsulele Cayman InselneqqBankReviewScreenStackHeaderSearchBarView-12 h-12 rounded-full bg-secondary-orange items-center justify-centergba(212, 212, 212, 0.3019607961177826)Isole Cayman Islandslope-downhill-skiing-nordic-walkingetStackWithMessagetAccDistancePerDirectionprocessinginstructio
```
```text
jwan, prowincja Chiny-combinator-squarecordUnsafeLifecycleWarningstroke-typography-700/20Realm.Sync.Server not respondingamepad-round-downotification://bookmarkCollection?type=testReviewScreenableInVideoQuestionsAvailableChipre-line-scan-sharpolygonStrokeWidthandleAlertIcondensedBoldChoose Course/Exam Oriented QBank > Subjectstroke-background-950/25Choose Exam (Test)Choose a color, optionally add a note, then Save. Tap a highlight later
```
### `Subject`
```text
mil mobi museum name net org pro tel travel ac co com edu gouv gov int mil net Units Selected easing is not currently supported on web. Using linear easing instead.toBytesBExplore Subjectstroke-background-700/95STUDENTS / ACCURACY_GRAPH_STRENGTH_OFFSET_PARAMSelect TagscreenReaderFocusable_inputMeasureAndScrollToKeyboardObserver finishedivRemTotal Time TakenableCppPropsIteratorSetterequestPermissionstroke-typography-900/95jumpBoth QBanks
```
```text
Providergba(252, 176, 29, isFocused: is out of 0 to use Reanimated 4 supports only the React Native New Architecture and web.__valueUnpackergba(34, 34, 34, list: isn't a one-updateSubjectIdflex-1 w-full flex-row px-4 md:px-8 pt-2 relative items-center justify-center  gap-1 mt-5mr-44 h-full absolute left-0 bg-primary-blue px-2 py-1 rounded-full items-center justify-center gap-x-1degg-off-outlineflex-row my-6 items-start   gap-2 md:mr-2 b
```
```text
deValue` is abstract and must be implemented in a subclass of `ReadOnlyNode`Adding listeners is only possible on the UI runtime., should be XY but got marked for review questionsBySubjectIdistanceFromStarts From:, should be number but got matching `/.variant_uriTypeg$c25Brazyliabsolute top-0 left-0 right-0 z-50 border-gray-200 bg-white border border-customGray-10  rounded-2xl mb-4 overflow-hidden flex-row items-center py-3 gap-2 rounded
```
```text
goods or services that Cerebellum Academy may offer.BOOKMARK_TABSON Document field names cannot contain null bytes, found: w-80 mx-1  my-1 rounded-lg  p-1.5fetchCompletedSessionsBySubjectIdForPYQ_TABSON Regex options cannot contain null bytes, found: w-80 my-1  mx-1.5Invalid response for blob - expecting object, was passed../../components/atoms/FlashToastMessageQueue.invokeCallback(?:\+(%[a-f0-9]{2})|([^%]+?)#FE653Bad event of type x, y
```
```text
 call "firebase.app('channel.importance' expected an Importance value.Invalid transition behavior "input" must be a string./Collection Namerican-football-sharpreviousTestBookmarkBySubjectIdifficulty_slider_dataddQbankSessionstroke-info-700/25Invalid transition property "length" is outside of buffer boundscreenPhysicalPixelstroke-typography-white/75Invalid value "list" argument must be an Array of Buffersapss.maskGenAlgorithm.AlgorithmId
```
### `Video`
```text
s direct children (found must not contain null bytes and expected -->vsubnequivDD MMM YYYY, hh:mm ab bc mb nb nf nl ns nt nu on pe qc sk yk KiBHermesInternal Server Error deleting Video DeletedigitalSignatureact-refresh-circle-sharpointerYLocalendar-search-circle-sharpopToToplaylist-add-circle-outlinew-boxvh-2 bg-primary-blue rounded-2xl px-6 py-3 justify-center items-centeredFlexclefile1
window.ReactNativeWebView.postMessage(JSON.strin
```
```text
st-add-circle-outlinew-boxvh-2 bg-primary-blue rounded-2xl px-6 py-3 justify-center items-centeredFlexclefile1
window.ReactNativeWebView.postMessage(JSON.stringify({eventType: 'getVideoUrl', data: player.getVideoUrl()}));
true;
    (function() {
      let historyLength = window.history.length;
      let currentIndex = 0;
      let isInitialPage = true;
      
      // Track navigation changes
      function updateNavigationState() {
   
```
```text
h-2 bg-primary-blue rounded-2xl px-6 py-3 justify-center items-centeredFlexclefile1
window.ReactNativeWebView.postMessage(JSON.stringify({eventType: 'getVideoUrl', data: player.getVideoUrl()}));
true;
    (function() {
      let historyLength = window.history.length;
      let currentIndex = 0;
      let isInitialPage = true;
      
      // Track navigation changes
      function updateNavigationState() {
        const newLength = wind
```
```text
nt passed in does not match the accepted typescapeCharddisk-pluseIMGElementStateWithCacheckmark-circle-sharpaper-plane-sharpkcs7asn1PREVIOUS_YEAR_QUESTIONSIGN_BYTE_LENGTHonor Play Video Expired on the UI thread.
See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#tried-to-synchronously-call-a-non-worklet-function-on-the-ui-thread for more details../../assertivector-arrange-aboveQBANK_TOP_TABSON Regex patte
```
```text
e', function (event) {
        const {data} = event;

        try {
          const parsedData = JSON.parse(data);

          switch (parsedData.eventName) {
            case 'playVideo':
              player.playVideo();
              break;

            case 'pauseVideo':
              player.pauseVideo();
              break;

            case 'muteVideo':
              player.mute();
              break;

            case 'unMuteVid
```
### `Profile`
```text
lm/schema/TestQuestions/actionsqsuperpowershellSuspendCounters cannot be used in collections.ArubasefontWeight-trackBuyPlanClickedSomaaliarrow-u-up-left-boldisappearLayoutEffectsetProfileImagetBytesSyncreateWorkletRuntime is not available in JSWorklets.LetonianimationMapplySpecould not read FormData body as blob--passive-effects-stopImmediatePropagationavigateAndStorePropsInAsyncStoragetDefaultConfigetOwnPropertyDescriptorstroke-seconda
```
```text
 In function components, you can read it directly in the function body, but not inside Hooks like useReducer() or useMemo(). Module exists, but the method is undefined.syncLastUserProfileUpdatedAttempting to run JS driven animation on animated node that has been moved to "native" earlier by starting an animation with `useNativeDriver: true` supplied to `unregisterCSSKeyframes` is not available in JSReanimated.useRefEffectextBackgroundCo
```
```text
 undefinedismissMissedSetext-md text-customGray-80 font-openSauceOneMedium text-base mt-1 text-primary-blue tracking-widevine-with-circlearHistory<a href=" is not in the set../UserProfileUpdate/apipeK requires at least one argumentext-error-700/70getWrapperson-sharplayListStartIndexpiresAttempt to get native tag from node not marked as "native" missing gen or run../api/featureToursapss.trailerFieldPathermometer-emptyCould not decrypt pr
```
```text
racter StringContainingamepad-round-rightext-outline-600/30#01D0FBReactNativeSpecified time is not a number: 'category.hiddenPreviewsShowSubtitle' expected a boolean value../CreateProfile/apieColorstroke-typography-0/90#027bffllightgreenable_app_level_pipeP requires at least one argumentext-error-700/75--color-record-hoverlay_bg-[#0483F71A]/10 p-2 rounded-lg w-10 h-10 md:w-14 md:h-14 items-center justify-centergba(156, 163, 175, 1)#0483
```
```text
e using the appAttestWithDeviceCheckFallback(?:[^,()]+|\([^)]*\))+(?=\s*,|$)updatePropsDOMElementTypeForwardRef(?:[^\s()]+|\([^()]*\))+1268This whatsapp number is already usedReactProfiler(?:\^)[v=\s]*(?:\s+|\s*,\s*)currency-yuanimation-timing-function: cubic-bezier(?:youtu\.be\/|youtube\.com\/(?:embed\/|v\/|watch\?v=|watch\?.+&v=))([^&?]+)_createSignatureDigestureHandlerRootHOC(?:{([\w ]*?)})?custom_test=truevent-busystemlanguageImgh_1
```
### `Notes`
```text
21.5786 44.9671 -24.7699 59.1528 -10.4802 68.2652ZOOM_WEB_SDK_URLIGHT_BLUE_EXTRA_20#008000 0 23 22jYO9Q8JR0B8lk9iPhone 12 Pro Max buffer length exceeded: textNodebugOverlayFrameVisNotesView-10 h-8 text-center items-center justify-center rounded-full #008080 0 230 144#0082F6#0088fairplayIntegrity#008b8bg-[#F4F0FF] mt-3 flex-row items-center pl-3 py-2 gap-1 rounded-md:flex-row md:flex-1 md:gap-4 px-4 md:pb-10#0099CCGSizevent-seat-passenge
```
```text
23#8b0000 0 58 144#8b008bg-[#F4F0FF] rounded-2xl mt-1 px-1 py-1 w-32 justify-center items-centerLabelComponentext-info-700/70#8b4513 13 13#8b5cf6#8c8c8cRLReasonConfirm Address for Notes Delivery Address info-circle-with-pluseDescription#8f949d7e6606e1b3e12852fad58b41662407#8fbc8feFuncRLDistributionPointstroke-background-muted/80#900 0 64 64 64#90ee90 0 64 65#9370db969dfb8c1f4505b905ab3b4947809disableKeyboardShortcutstroke-primary-500/70
```
```text
#ef4444#ef6632.5.29.35#efbb49#efc457#efefefloodColoreset_type#eff0f1.2.840.113549.1.9.21#f08080#f0ad4ev-plug-chademocratLeastOneAreaChartifactTypeg$c32#f0e68composeWith or Without NotesListroke-background-400/0#f0e7d1.2.840.113549.1.9.22.16.840.1.101.3.4.1.22#f0f8ffemergenode ./scripts/export-unpackers.jsVersionavigation-variant-outline#f0fff0#f0ffffemorphologyin-yangmsdabout:blankegetScriptNameOrSourceURLONECARETLOOSEPLAINFO_VIDEO_UNIT
```
```text
976+977+98+9924e549e672a6ac309990aff42b3cdad_activeview_item_list_id+993+994+995+996+998+Infinitypingoogle-street-view_search_resultsAppendQuery, tab, backdropFilterIcontainerInnerNotesExpandedSubjectsListroke-background-300/80MI 8 SEARCH_FOR_PHOTOSLIDER_DEFAULT_INITIAL_VALUExpected a `Map` object, but received: ` of type `timeZoneName` and `timeZoneOffsetInMinutes` cannot be specified at the same time-sharprefersCrossFadeTransitionstro
```
```text
oke-background-error/70MRCTFBLoginButton.IconnectDatabaseEmulator()BSON_DATA_CODE_W_SCOPEN_DRAWERCTFBSendButton.SpinnerRotateBackwardIcontrol-point-duplicate-sharparsimpleStyleBuy Notes Detailstroke-background-900/30Buy Nowa Kaledoniarrow-horizontal-lock-person-3Buy Plan DiscountDownotifee.deleteChannel(*) 'channelId' expected a string value.PRODUCT_REQUEST_TIMED_OUT_ERROR_OPENING_CUSTOM_MODULE_CONFIGNOREMOVE_NOTE_ANNOTATION_CHAPTER_CLE
```
### `Flashcard`
```text
p layer. If you want to see if this component is registered with React Native, please call hasViewManagerConfig(' is unsupported in this environment./semverifyOtpForAccountDeletionFlashcardPresstroke-tertiary-700/0^xn--component-layout-effect-mount-start- You are not using Expo Go
***TRUNCATED TO 500 CHARACTERS*** Negative values are not shown on the graphsl(0, 100%, 92%)\--passive-effects-start--component-passive-effect-mount-start- Yo
```
```text
-700/95Assertion failed!**/__tests__/**/Assets/ReactNativeBlobUtil-blobs/` but received " is not a valid port1CONTEXT_SPECIFICannot create URL for blob!**/__typetests__/**multiGet Flashcards!ReactAndroid/.cxxNativeAnimatedEnabledInvite friends to Cerebellum Academy and learn together!ReactAndroid/external-artifacts/artifactshcyMissing index!ReactAndroid/external-artifacts/build compare-horizontalOuterRangeOffsetMinSampleCountrackFibersl
```
```text
izontalOuterRangeOffsetMinSampleCountrackFiberslowToStringet NONEW!ReactAndroid/hermes-engine/.cxxNativeAnimatedRemoveJsSyncupbrcapturingListenerstroke-background-muted/95Practice Flashcards!ReactAndroid/hermes-engine/build.gradle.ktstroke-background-muted/70Recall Effortlessly!ReactAndroid/src/main/third-party-popperm-media undefinediscount_valuecropStart your Free 3 Day Trial Now!android/buildIdisableBackButtonMenuDotsIcontentCopyIcon
```
```text
 message length is invalid.#EAF6FFiyicy#EBEBF5#EBF1FDecoded data is not valid UTF-8. Maybe try base32.decode.asBytes()? Partial data after reading #ECF1FCambodjavaPackageName#ECFBFFlashcard free trial granted successfullyAxisExtraHeightAtTopressOutTimeoutext-secondary-coralOrangetInspectorDataForViewTag() is not available in production-quantity-limitsNavigationsToAppBoundDomainsert-comment-alte-plus-mobiledatadf-scanner-offill-error-50/
```
```text
333]badgeHorizontallowsFeature flags cannot be overridden more than onceInnerflex-row gap-2 justify-between items-start gap-2 md:mr-2 border rounded-xl p-4 my-2 overflow-hiddenableFlashcardFeature is not availablegendDataddress_information-sharphone-ring-outlineReactNativeBlobUtilFetchPolyfill-background-100/20WHATWGFetching _downloadFileNotFound:flushLayoutEffectsetShouldAnimateExitingForTagetVideoPlaybackInfoApicture-as-pdfFilePathand
```
### `/home`
```text
ct-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-info/subject/reattemptsession/profs/minimal-subject/has-chapter-access/extended-collect
```
```text
nfig.sync-xhryvniaddress2Pscripts/xcode/ccache.confirmPasswordReset()_disconnectAnimatedView2isFreeOrNonMissionPlan-connectAuthEmulator()headerConfigetPrimaryKeyColumnotification://homeCerebellumIconnectFirestoreEmulator()fan-auto-downloadType == "vdo" OR downloadType == niliveIconnection-errorCodeNameCUSTOM_MODULE_MODE_REQUEST_HEADERS_RECEIVEDictionary_contains multiple periodsoldering-iron-boardUcircouldn't find root of feed-discussio
```
### `/qbank`
```text
stados Federados decorator cannot be used without the `@realm/babel-plugin` Babel plugin. Please check that you have installed and configured the Babel plugin../../../redux/actions/qbankFilterActionDeletedMessages()Could not compute certificate digest. Unknown message digest algorithm OID.@tour_guide:not([hidden]):not([tabindex="-1"]),
            controls: does not implement toAsymmetricMatcher() => {}useDeXModeepGet to know how well y
```
```text
st-info/?type=mock_test&ordering=-publish_date&show_sectional_test=truevalOriginput[type="datetime"]&platform=&sdkLeadId=ReactNativeBlobUtil-file://test-filters/revenuecat-payments/qbank-bookmarked-questions/order/in-video-questions/state/external-media/custom-test/chapters/?remove_download=1&size=TRIANGLE_RIGHThe path must start with '/' (declaring ' is supported./rangescc-amexclamation-triangle-outline'ios.communicationInfo' already e
```
```text
ify-center items-center bg-translucent-100street-address-card-o-object-fitToContentstroke-background-success/90fantasy-land/app-version/video/topic-questions/summary/test/analytics/qbank-attempted-questions-count/analytics/subject-wise-attempted-questions-count/assets/node_modules/@react-navigation/elements/src/assets/node_modules/react-native/Libraries/LogBox/UI/LogBoxImagesdotollocal-hotel-altext-primary-100/40isRunningInTestLabsolute
```
```text
.coefficientityTried to apply CSS animations to bottom rightArrowIconotifyTaskRetrying.../../../../redux/actions/navigationActionErrorBesley-Regularbitrary../../../../redux/actions/qbankCacheActionTypeEnumColumns does not support horizontal.RNAppleAuth.AppleAuthRequestOptions 'Invalid params found.../../../../utils/asyncStorageReferencertinfoSignatureOid_worklet_11594828589059_init_dataPointLabelWidthunderstorm-sharpreferredVideoQuality
```
```text
ter mr-3AntDesign.ttfootball-ballKeystroke-info-800/30_initialPropsMapplication/json, text/plain, */*ReactNativeBlobUtil-content://test-bookmarked-questions/filter/revenuecat-order/qbank-attempted-questions/oauth/token/refresh/storage/emulated/0/Android/data/com.cerebellummobileapp/.doNotDelete AccountBy_worklet_4479316778333_init_dataccess-point-remove event listenerMiddleware/address-info/analytics/qbank-wise-attempted-questions-count
```
### `/pyq`
```text
return errorMessage==='';}codePointAt least one of URL or message is requiredfeaturesuspendedStart Free Trial!ReactAndroid/src/test-analytics/attempted-questions-count/report-issue/pyq-bookmarked-questions/modal-announcement/in-video-questions/attemptstroke-background-600/50get TouchableNativeFeedback/Report errors occurreduceMotionChangedAction,
          },
          events: {
            'onReady': onPlayerReady,
            'onState
```
```text
details/platform-metadata/latest-video-session/me/fulfilled ThenableNetwork()flashCardFlipCardTrialMetaSchemail-mark-as-unreadJSONStream://test-attempted-questions/rest-auth/logout/pyq/note-annotations/in-video-questions/startAfter()_initialFrameHeighttps://cerebellumacademy.com/about-us/user-profile/me/subject-bookmarked-videos/qbanks/plan/latest-session/latest/?subject_id=brvbarHeighttps://cerebellumacademy.com/terms-and-conditions/vi
```
### `/grand-test`
```text
AnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlearrowrighttp
```
### `/chapter`
```text
ype="datetime"]&platform=&sdkLeadId=ReactNativeBlobUtil-file://test-filters/revenuecat-payments/qbank-bookmarked-questions/order/in-video-questions/state/external-media/custom-test/chapters/?remove_download=1&size=TRIANGLE_RIGHThe path must start with '/' (declaring ' is supported./rangescc-amexclamation-triangle-outline'ios.communicationInfo' already exists in the object./dist/platform/node/index.js.flow-rootFontSize'notification.andro
```
```text
gedComponentTreeRollOutRighttp://localhost:8081/units/student-test-analytic/qbank-sessions/qbank/performance-analytics/profile/languages/flashcard-free-trial/delete-account/college/chapter-video-detail/bookmarked-test-info/bookmarked-question-units/assets/src/assets/svgIconsole.level_endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebelluma
```
```text
backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-i
```
```text
StandardFullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-info/subject/reattemptsession/profs/minimal-subject/has-chapter-access/extended-collections/currenttime/chapter/notes/?url=truev-stationVideoFullscreenPlayerWillPresentiment-satisfied-altext-success-600/50HiszpanianimatedHeighttps://cerebellumacademy.com/contact-us/video-category-bookmarked-videos/subject-test-session/question-details/platform-metadata/latest-v
```
```text
r' expected a function.format-text-rotation-angle-downotifee.setBadgeCount(*) 'count' expected a number value greater than 0.444isTooltipWidthackerrank_generatedColumnotification://chapterVideo?_cancelHoverOutDelayTimeoutdatedEnableExperimentalPercentWidthand-pointing-downotification://testInstruction/:testId/:testName/:testType/:testStatus/:testDuration/:testStartDateTime/:isTestFree/:testWindowDuration/:testSession/:showInstantSolutio
```
### `/subject`
```text
ontrols: does not implement toAsymmetricMatcher() => {}useDeXModeepGet to know how well you are doing,
            fs: does not support multiple Firebase Apps../../../redux/actions/subjectChapterActionDisconnect()TupleSchemakeFromPolygono-cellTextraArgument appears to not be a ReactComponent. Keys: tuple value has too few items, expected a length of ms exceeded limit of 200] render; tabKey: flex flex-row items-center justify-center gap-
```
```text
street-address-card-o-object-fitToContentstroke-background-success/90fantasy-land/app-version/video/topic-questions/summary/test/analytics/qbank-attempted-questions-count/analytics/subject-wise-attempted-questions-count/assets/node_modules/@react-navigation/elements/src/assets/node_modules/react-native/Libraries/LogBox/UI/LogBoxImagesdotollocal-hotel-altext-primary-100/40isRunningInTestLabsolute -top-1 -right-0 overflow-hidden z-10Alban
```
```text
deoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTu
```
```text
ion/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-info/subject/reattemptsession/profs/minimal-subject/has-chapter-access/extended-collections/currenttime/chapter/notes/?url=truev-stationVideoFullscreenPlayerWillPresentiment-satisfied-altext-success-600/50HiszpanianimatedHeighttps://cerebellumacademy.com/contact-u
```
```text
?url=truev-stationVideoFullscreenPlayerWillPresentiment-satisfied-altext-success-600/50HiszpanianimatedHeighttps://cerebellumacademy.com/contact-us/video-category-bookmarked-videos/subject-test-session/question-details/platform-metadata/latest-video-session/me/fulfilled ThenableNetwork()flashCardFlipCardTrialMetaSchemail-mark-as-unreadJSONStream://test-attempted-questions/rest-auth/logout/pyq/note-annotations/in-video-questions/startAft
```
### `/video-category`
```text
endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-prim
```
```text
ctions/currenttime/chapter/notes/?url=truev-stationVideoFullscreenPlayerWillPresentiment-satisfied-altext-success-600/50HiszpanianimatedHeighttps://cerebellumacademy.com/contact-us/video-category-bookmarked-videos/subject-test-session/question-details/platform-metadata/latest-video-session/me/fulfilled ThenableNetwork()flashCardFlipCardTrialMetaSchemail-mark-as-unreadJSONStream://test-attempted-questions/rest-auth/logout/pyq/note-annota
```
```text
/cerebellumacademy.com/about-us/user-profile/me/subject-bookmarked-videos/qbanks/plan/latest-session/latest/?subject_id=brvbarHeighttps://cerebellumacademy.com/terms-and-conditions/video-category/subject-video-detail/questions-data/prof-video-categories/lookup?bundleId=headphones-battery-10-bluetooth-audio/testSessions/mock_test/session-result-summary/qbank-detail/pending_js_to_native_queueStackTrace$$getSyncanShow-to-vote-outline@@tran
```
### `/video-category-units`
```text
endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-prim
```
### `/live-tests`
```text
ustomModuleAnalysisAirplaneModeSyncamera-indoor-backRightBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlea
```
### `/test`
```text
nt` wasn't called.Invalid keyframe selector "data" must be a String when encoding is "utf8" or "base64", but it is " in box shadow " but this module could not be found../../scripts/test-ts.sh __typetests__esModule AccuracyGraphStrengthOffsetSchemail-open-multiple-outlinefirst_visitor must be a function Bezier_reactNativeReanimated_BezierTs11(mX1,mY1,mX2,mY2){const{_worklet_4167038034701_init_data,kSplineTableSize,calcBezier,kSampleStepS
```
```text
'){logger.warn('Invalid spring config'+errorMessage);}return errorMessage==='';}codePointAt least one of URL or message is requiredfeaturesuspendedStart Free Trial!ReactAndroid/src/test-analytics/attempted-questions-count/report-issue/pyq-bookmarked-questions/modal-announcement/in-video-questions/attemptstroke-background-600/50get TouchableNativeFeedback/Report errors occurreduceMotionChangedAction,
          },
          events: {
    
```
```text
N_IMPLEMENTATION_SPECIFICannot create transformer for the full message or use the non-minified dev environment for full errors and additional helpful warnings../../../redux/actions/testFilterActionDocumentMetadataLoaded or onTTreeChangetGlobalStyleInspectorbounceInDownotifee.createChannelGroup(*) for the screen '+
((__t=(%[a-f0-9]{2})+1246 246 246Invalid schema for value: ` instance, but received: handleExitDeleteModevice_namergeSwitche
```
```text
-4 text-[14px] text-customGray-80 font-medium-with-circledowno renderItem!pr-1.2.840.113549.1.1.83emSizeSlovakiarrow-u-down-left-boldigitToBasic Ques this week!pr-[4px]!src/private/testinginxopfill-info-0/20!text-[26px]!text-black font-medium text-base mr-2!text-xl mr-1 !text-blue-500px-with-circle-box-outline!text-xs !text-customGray-80 pl-0.5.2!text-sm  mt-2 font-intersemibold text-customGray-80 text-sm pl-3 font-inter text-sm text-cu
```
```text
1.8 1.617 1.885.97.07 1.8-.661 1.87-1.617 0-.015.197-2.687.197-2.687&hash=&hl=en&gl=USDominican Republic-offill-error-300/90&language_id=&minimal=truev-plug-type1^bundle-assets:\/\/test-info/?type=mock_test&ordering=-publish_date&show_sectional_test=truevalOriginput[type="datetime"]&platform=&sdkLeadId=ReactNativeBlobUtil-file://test-filters/revenuecat-payments/qbank-bookmarked-questions/order/in-video-questions/state/external-media/cus
```
### `/test-analytics`
```text
'){logger.warn('Invalid spring config'+errorMessage);}return errorMessage==='';}codePointAt least one of URL or message is requiredfeaturesuspendedStart Free Trial!ReactAndroid/src/test-analytics/attempted-questions-count/report-issue/pyq-bookmarked-questions/modal-announcement/in-video-questions/attemptstroke-background-600/50get TouchableNativeFeedback/Report errors occurreduceMotionChangedAction,
          },
          events: {
    
```
### `/qbank/performance-analytics`
```text
esponderender_datarrowOffsetTopNavBarrow-expand-updateAppVersionormalizeStoredPathandymanagedComponentTreeRollOutRighttp://localhost:8081/units/student-test-analytic/qbank-sessions/qbank/performance-analytics/profile/languages/flashcard-free-trial/delete-account/college/chapter-video-detail/bookmarked-test-info/bookmarked-question-units/assets/src/assets/svgIconsole.level_endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResu
```
### `/notes`
```text
tBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-info/subj
```
```text
Fullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-info/subject/reattemptsession/profs/minimal-subject/has-chapter-access/extended-collections/currenttime/chapter/notes/?url=truev-stationVideoFullscreenPlayerWillPresentiment-satisfied-altext-success-600/50HiszpanianimatedHeighttps://cerebellumacademy.com/contact-us/video-category-bookmarked-videos/subject-test-session/question-details/platform-metadata/latest-video-ses
```
### `/notes-page`
```text
tBtnRighttps://cerebellumacademy.com/privacy-policy/video-category-units/subject-unit-notes/question-tags/prof-subject-notes/live-tests/grand-test/exclusive-content/courses/chapter/notes-page/bookmarked-video-units/bookmarked-questions/all/attempted-question/home/qbank/?fetch_session=truevalFunctionstroke-primary-900/50web-pluseTurboModuleInteroprepareStandardFullastfm-with-circlearrowrighttps://react.dev/errors/video-playback-info/subj
```
### `/flashcard`
```text
d+\-.]*:)?\/\/[#@] ?sourceMappingURL=([^\s'"]+)\s*${path} must be an integerlangDropDwnTextContainereactNativeReanimated_EntryExitTransitionTs1Factory^ReactNativeBlobUtil-file\:\/\/flashcards?\/?${path} must be at least ${min} charactersToExpression\?${path} must be at most ${max} charactersapss.saltLength.saltLengthemeVariant Also NegotiatestChoiceAnalyticsafety-dividerenderCdataEnds on: \?.*${path} must be definedotext-secondary-0/50\
```
```text
d-updateAppVersionormalizeStoredPathandymanagedComponentTreeRollOutRighttp://localhost:8081/units/student-test-analytic/qbank-sessions/qbank/performance-analytics/profile/languages/flashcard-free-trial/delete-account/college/chapter-video-detail/bookmarked-test-info/bookmarked-question-units/assets/src/assets/svgIconsole.level_endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisAirplaneModeSyncame
```
```text
z   @
      ÿÿÿÿ       -   .   0   9   A   Z   a   z   .
      ÿÿÿÿµ       A   Z   a   z       
<
        ÿÿÿÿ   
SCRIPT
       ÿÿÿÿ0   
>     @     

/flashcard
               s
          4   /        0   9               o           6   9   
    	   	   '          6     [
        ÿÿÿÿ,      [   [   ]  N      
      ÿÿÿÿx      (   )   ,   /   :   :   _
```
### `/profile`
```text
TopNavBarrow-expand-updateAppVersionormalizeStoredPathandymanagedComponentTreeRollOutRighttp://localhost:8081/units/student-test-analytic/qbank-sessions/qbank/performance-analytics/profile/languages/flashcard-free-trial/delete-account/college/chapter-video-detail/bookmarked-test-info/bookmarked-question-units/assets/src/assets/svgIconsole.level_endEdgeRadiuseFetchVideoByChapterUnitIdblinds-open-in-fullastResumedTestCustomModuleAnalysisA
```
### `/plans`
```text
ri=cerebellumacademyotpless://otpless-user-register/intro-video/faq/data-reset/charge/bookmarked-videos/bookmarked-questions/bulk-delete/auth/validate-user/assets/src/assets/images/plansPagent_definePropertiesetIsJSResponderender_datarrowOffsetTopNavBarrow-expand-updateAppVersionormalizeStoredPathandymanagedComponentTreeRollOutRighttp://localhost:8081/units/student-test-analytic/qbank-sessions/qbank/performance-analytics/profile/languag
```
### `/subscription`
```text
single character stringarage-open-variantext-outline-600/50popNestedEffectDurationshowAccuracyThresholdMessagetCachedBaseURLOG_OUT_MSGiven StackFrame is not an object../../../utils/subscriptionFirebaseEventsunamiliaddNodeepLinkingRoutestOnly_onPressInsufficient security.qbankNameListContainerecomputePluginOrderinget DynamicColorIOS is not available on this platform.75 24.378-.75-.47v-1.522l24-18.58v2.571zLongSizeCSSPropertyValidatorgba(
```
### `font-inter-semibold`
```text
getPlaybackRate()}));
true;
    at new BSONSymbol("#FFB90Bad mapping of type |
 --> <![CDATA[ \t]*[\r\n\f]+[ \t]*NotEqualTildecodePathSegmentext-lg font-semibold text-primary-dark font-inter-semiboldiving-helmetaTokensureValidHostname "<4.11.0" has not been registered. This can happen if:
 at %c%s%c com edu gov mil net news org but received one with a length of ` for plugin `runOnUI` can only be used with worklets.^([a-zA-Z][a-zA-Z\d+\-
```
```text
android.style' BigPictureStyle: 'picture' expected a number or object created using the 'require()' method or a valid string URL.mapObjectFitext-xl font-semibold text-primary-dark font-inter-semiboldocument-lock-sharparseUrlastUpdatedAttempting to create an object of type 'RNFirebase.Base64.btoa' failed: The string to be encoded contains characters outside of the Latin1 range.mapTo' on ';
    document.body.style.color = ' resolves to bo
```
```text
t-secondary-purple-1000 ml-2 text-sm font-medium  mr-2purchaseDiscountedProductext-secondary-yellowBgColorpurchaseStoreProductext-sky-500qintext-sm font-semibold text-primary-dark font-inter-semiboldjcyquatintext-sm font-semibold text-primary-dark font-openSauceOneedsPointerDatadvanceAnimationByFramenu-right-outline_quote-a-rightext-sm text-customGray-50 mt-1NotLessSlantEqualignCenteradioAlphabetTextext-sm text-customGray-90 font-inter 
```
```text
lsTsx16FactorysuspendIfUpdateReadFromEntangledAsyncActionswizzlesyncTestQuestionsWithRetrytext-2xl font-besley text-gray-900 text-left mb-2text-2xl font-semibold text-primary-dark font-inter-semiboldtext-[10px] text-customGray-50 font-medium font-openSauceOnetext-[12px] font-inter text-customGray-80 mb-6text-[14px] font-medium text-gray-900 font-openSauceOnetext-[20px] font-openSauceOne text-black font-medium mt-6text-[8px]  text-custom
```
### `font-openSauceOne`
```text
                   px-2 py-1 rounded-full self-start mb-2
                        text-customGray-50 text-xs
                         flex-row items-center
                        font-openSauceOneMedium text-primary-dark text-base mb-1
                      

Cerebellum Academy app link 
  `;
  document.head.appendChild(style);

  var annotationRoot = document.getElementById('annotation-root') || document.body;

  function measureConte
```
```text
2;124;124;124m%s %o[0m0 0 7 4.27v12.276l-7-4.27z[39m0 5.234 1.637-2.642H2.86v.086L1.14 5.234zM0 .001H1.14L2.86 2.558v.085H1.637z[49m10 6-4 4printBigIntext-xs text-customGray-80 font-openSauceOneMedium max-w-[70%] ml-2 w-[93%] md:w-full h-[1px] bg-customGray-5 border border-customGray-15 rounded-2xl bg-white  border-[3px]   rounded-full items-center justify-center-align-nonew MinKey()useGetAccuracyMomentumin-width-wideterminePathrowAn
```
```text
ayout (None)\s*\)Unexpected Suspense handler tag (Null)ImUsed custom semver, and converted result from store (Object Identifier)Bosnia ErzegovinaccessibleObjectext-white text-base font-openSauceOneSemibold font-semiboldochubspotlightBorderRadiuseProgresscrollLeftOffsetSampleRate Using an embedded object (Octet string)[eval] (Printable String)--color-search-match-current version (Real)hydro-power-inputRange (Relative Object Identifier)is
```
```text
r font-intermedium  text-customGray-40 text-[10px] font-medium text-secondary-purple font-inter text-[10px] font-medium pb-2 text-customGray-80  text-[9px] text-center font-medium font-openSauceOneBold bg-white mx-4 md:mx-12 my-3  rounded-xl border border-primary-blue/20 rounded-2xl bg-primary-blue/10 border border-primary-blue/60flex-row items-center justify-between px-4 pt-4 pb-2 bg-white border-customGray-10 flex-row  justify-center 
```
```text
y-between w-full  border-t border-customGray-10 bg-white px-4 py-4 bottom-0 absolute  bottom-0 sm:left-0  z-0 opacity-80hashSetext-white text-4xl font-bold text-xs  text-[#4E4E4E] font-openSauceOneMedium my-1 tracking-widestructiveButtonIndexecuteJavaScriptBundleEntryPointEndtext-customGray-80 text-[14px] font-inter font-semibold text-[16px] text-white mr-1.5bg-extras-blue10 py-0.5 px-3 rounded-lg mt-1 text-xs text-customGray-50 font-in
```
### `font-openSauceOneBold`
```text
r font-intermedium  text-customGray-40 text-[10px] font-medium text-secondary-purple font-inter text-[10px] font-medium pb-2 text-customGray-80  text-[9px] text-center font-medium font-openSauceOneBold bg-white mx-4 md:mx-12 my-3  rounded-xl border border-primary-blue/20 rounded-2xl bg-primary-blue/10 border border-primary-blue/60flex-row items-center justify-between px-4 pt-4 pb-2 bg-white border-customGray-10 flex-row  justify-center 
```
```text
 text-customGray-80 font-inter text-xs my-4 mb-16isFileInputext-white text-lg font-openSauceOneSemiboldock-windowStateChangetLimitedUseToken()Kcedilogbox_message_contents_text-2xl font-openSauceOneBold text-primary-dark text-3xl font-besleyMediumlaptop-offill-background-success/95matchWhitelistCacheSetext-xl font-openSauceOneSemibold mb-2 text-primary-dark text-lg font-besleyMedium flex-shrink pr-2bg-white text-primary-dark/40 text-xs f
```
```text
y-dark text-[18px] font-bizUdpmincho text-lg text-primary-dark pb-2 relative z-10 mt-4 h-6 w-2/3 bg-gray-200 rounded-md:h-[225px]marginBlockStartext-primary-blue text-lg font-bold font-openSauceOneBold mr-2mtext-3xl text-primary-blue font-bold mb-2 text-gray-700 text-lg  text-primary-dark font-besley mt-2--color-timeline-internal-module-text-[10px] text-customGray-90 flex-1 font-inter font-medium text-[14px] text-customGray-50 mb-2text-
```
```text
font-medium text-customGray-80 font-inter text-[12px] text-customGray-50 font-medium font-openSauceOne text-xl text-leftActionTranslatest_qbank_idstroke-typography-50/75text-[8px] font-openSauceOneBold text-customGray-80 font-semibold ml-3.5privateKeyPublicExponentext-secondary-orange text-center font-openSauceOneMedium text-base text-leftActionstroke-success-800/0PrecedesTildecodeXMLStrictext-lg mt-4 md:mb-4 font-openSauceOneMedium tex
```
```text
ngradient-via-postal-address-localityNameBijeenkomstpostal-address-regionDragLeftext-secondary-300/95text-white font-inter font-semibold text-sm font-openSauceOneMedium text-white font-openSauceOneBold text-sm p-1 pl-2 pr-10_hasMoreplaceTilde premajorgba(17, 24, 39, 1)cuepreminor-crasheetDefaultResizeAnimationEnabledborderBottomEndRadiuseCompletedDirectUrlDownloadscroll-prepareAction did not return an objectext-error-700/80NotHumpDownHu
```
### `font-besley`
```text
isFileInputext-white text-lg font-openSauceOneSemiboldock-windowStateChangetLimitedUseToken()Kcedilogbox_message_contents_text-2xl font-openSauceOneBold text-primary-dark text-3xl font-besleyMediumlaptop-offill-background-success/95matchWhitelistCacheSetext-xl font-openSauceOneSemibold mb-2 text-primary-dark text-lg font-besleyMedium flex-shrink pr-2bg-white text-primary-dark/40 text-xs font-inter font-medium -ml-2 p-1Guyaneed server to
```
```text
enSauceOneBold text-primary-dark text-3xl font-besleyMediumlaptop-offill-background-success/95matchWhitelistCacheSetext-xl font-openSauceOneSemibold mb-2 text-primary-dark text-lg font-besleyMedium flex-shrink pr-2bg-white text-primary-dark/40 text-xs font-inter font-medium -ml-2 p-1Guyaneed server to load from-font-[Open Sauce One] font-medium text-sm font-openSauceOne mr-2 opacity-1.2.840.113549.1.1.7maxStringLimitext-primary-dark tex
```
```text
luseIMGElementPropscroll-pyUnexpected invocation!bg-transparent border border-primary-blue rounded-lg py-2 px-6 self-center mb-6New Update Available!flex-[0.97]#text-2x font-bold !font-besleyMediumbrella-closed-variantext-typography-300/40^((https?|ftp):)?\/\/(((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:)*@)?(((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.
```
```text
edContentAsn1#F4F1FFontisto.ttfill-background-200/20#F4F8FCambogiabsolute top-0 right-0 bottom-0 rounded-full overflow-hidden left-0 pointer-events-none items-end ml-2 text-[18px] font-besley text-black text-base flex-1 flex-row gap-2 justify-center items-center  rounded-[14px]  px-3 py-4 m-2 max-w-[20vw] md:max-w-[80px] h-[56px] rounded-lg bg-gray-100#F4F8FFourth ProfcireactNativeReanimated_interpolateColorTs1Factory#F5F4F5#F5F5FCamboj
```
```text
right-0 items-center justify-centerControlsRow-16 h-16 bg-[#FDE7DE] rounded-full flex-row items-center justify-center pb-8 -mt-40%([a-zA-Z%])cularrplain-text-3xl text-primary-dark font-besley leading-loose invalid filter:invert(100%)get controlledBottomTabsolute -left-2 z-50%7Enter Email cannot contain multiple @ symbolstatLabelivestreamId+2120%ileadingSectionalTestScreensureSubjectHasHashield-home-outline(top|bottom|left|right|center|\
```
### `bg-white`
```text
econnect:
- Ensure that Metro is running and available on the same network
- Reload this app (will trigger further help if Metro cannot be connected to)
            mt-6 py-3 px-4 bg-white border flex-row gap-1 border-customGray-10 rounded-full
            items-center justify-center
                  bg-white border border-gray-200 rounded-xl  
                        px-2 py-1 rounded-full self-start mb-2
                        text-
```
```text
Metro cannot be connected to)
            mt-6 py-3 px-4 bg-white border flex-row gap-1 border-customGray-10 rounded-full
            items-center justify-center
                  bg-white border border-gray-200 rounded-xl  
                        px-2 py-1 rounded-full self-start mb-2
                        text-customGray-50 text-xs
                         flex-row items-center
                        font-openSauceOneMedium text-p
```
```text
tMeasureStartedprocessNextKeyUsagent_possibleConstructorReturn fibers should always be each others' alternates. This error is likely caused by a bug in React. Please file an issue.bg-white p-4 rounded-xl mb-3 border border-customGray-15 md:w-[32%] may be overwritten by a layout animation. Please wrap your component with an animated view and apply the layout animation on the wrapper.FLASH_TOASTOP_PROPAGATION_FLAG_KEYour Accuracy - origin
```
```text
merable:false}});}isHTMLElementext-white text-sm font-bold  text-centergba(208, 75, 95, go to step is not a constructor or null is not a valid argument for URI is already relative bg-white p-4 z-10 h-full md:px-10 h-14 md:h-16 bg-primary-blue justify-center items-center rounded-xl mr-4 md:mr-6#24324cz-30degravector-polyline-editstroke-primary-600/95blanchedalmondeclarations-resizeImgetTypeHelpersistentCacheIndexManagereactNativeReanimat
```
```text
eMessagingHeadlessTask "this.props" should not be accessed during state updatest_viewedivide-square-root-boxw-12 h-12 md:w-16 md:h-16 my-3 rounded-full items-center justify-center bg-white rounded-2xl border border-gray-200  p-4 overflow-hidden flex-1 border bg-white border-customGray-5 rounded-lg p-3 ml-2 items-center flex-row justify-between w-full  border-t border-customGray-10 bg-white px-4 pt-4   items-start md:mb-4  flex-1 flex-ro
```
### `rounded-xl`
```text
          mt-6 py-3 px-4 bg-white border flex-row gap-1 border-customGray-10 rounded-full
            items-center justify-center
                  bg-white border border-gray-200 rounded-xl  
                        px-2 py-1 rounded-full self-start mb-2
                        text-customGray-50 text-xs
                         flex-row items-center
                        font-openSauceOneMedium text-primary-dark text-base mb-1
     
```
```text
edprocessNextKeyUsagent_possibleConstructorReturn fibers should always be each others' alternates. This error is likely caused by a bug in React. Please file an issue.bg-white p-4 rounded-xl mb-3 border border-customGray-15 md:w-[32%] may be overwritten by a layout animation. Please wrap your component with an animated view and apply the layout animation on the wrapper.FLASH_TOASTOP_PROPAGATION_FLAG_KEYour Accuracy - originated from the
```
```text
to step is not a constructor or null is not a valid argument for URI is already relative bg-white p-4 z-10 h-full md:px-10 h-14 md:h-16 bg-primary-blue justify-center items-center rounded-xl mr-4 md:mr-6#24324cz-30degravector-polyline-editstroke-primary-600/95blanchedalmondeclarations-resizeImgetTypeHelpersistentCacheIndexManagereactNativeReanimated_updatePropsTs1FactoryAn unsupported type was passed to use(): shouldFreeze: com edu gov 
```
```text
 or "options.md" not specified./OverloadYield.jsxscrew-round-topCloselectByIdjustifyContentCentereactNativeReanimated_EasingTs10Factoryflex-1 py-3 px-6 border border-customGray-15 rounded-xliveSectionGif-modified-since :
Valid keys: (malformed UTF8)bg-extras-blue10 px-4 py-2.5 rounded-fullHeightWithBlackBgetOffsetLongPressDeactivationDistancellular-sharpanorama-vertical-select-inverse-mask--react-lane-labels--component-passive-effect-un
```
```text
-leftext-secondary-700/75UnBookmark Questions Not VisitedidWarnAboutUncachedPromisecondaryButtonColorenderLabelogo-behance-square-fill-background-0/90Something Went Wrong!px-2 h-4 rounded-xl justify-center items-start pl-6 Cannot read ContentInfo.ContentTypeTabsHost [Function 'notification.android.style' InboxStyle: 'lines' expected a string value at array index com edu gov mil org club com ebiz edu game gov idv mil net org art asso com
```
### `border-customGray-15`
```text
_possibleConstructorReturn fibers should always be each others' alternates. This error is likely caused by a bug in React. Please file an issue.bg-white p-4 rounded-xl mb-3 border border-customGray-15 md:w-[32%] may be overwritten by a layout animation. Please wrap your component with an animated view and apply the layout animation on the wrapper.FLASH_TOASTOP_PROPAGATION_FLAG_KEYour Accuracy - originated from the default application on
```
```text
ithm"options.message" or "options.md" not specified./OverloadYield.jsxscrew-round-topCloselectByIdjustifyContentCentereactNativeReanimated_EasingTs10Factoryflex-1 py-3 px-6 border border-customGray-15 rounded-xliveSectionGif-modified-since :
Valid keys: (malformed UTF8)bg-extras-blue10 px-4 py-2.5 rounded-fullHeightWithBlackBgetOffsetLongPressDeactivationDistancellular-sharpanorama-vertical-select-inverse-mask--react-lane-labels--compon
```
```text
.234zM0 .001H1.14L2.86 2.558v.085H1.637z[49m10 6-4 4printBigIntext-xs text-customGray-80 font-openSauceOneMedium max-w-[70%] ml-2 w-[93%] md:w-full h-[1px] bg-customGray-5 border border-customGray-15 rounded-2xl bg-white  border-[3px]   rounded-full items-center justify-center-align-nonew MinKey()useGetAccuracyMomentumin-width-wideterminePathrowAndUnwindWorkLoopDetectedrawableFolderInBundle was not loaded from Metro.o.objectType' on ';
```
```text
d-full p-2 bg-white/80 mb-8k-plusb-offill-error-800/90flex-row items-center bg-white rounded-xl px-4 py-3 border border-customGray-10 rounded-xl p-5.8.3flex-row items-start border border-customGray-15 p-4 rounded-xl my-3.125degg-sharpartly-sunny-outline--color-timeline-priority-border border-primary-blue bg-white border border-customGray-15 rounded-2xl justify-center items-centerPictureInPictureOnLeavector-polyline-minuseTNodeChildrenRe
```
```text
xl p-5.8.3flex-row items-start border border-customGray-15 p-4 rounded-xl my-3.125degg-sharpartly-sunny-outline--color-timeline-priority-border border-primary-blue bg-white border border-customGray-15 rounded-2xl justify-center items-centerPictureInPictureOnLeavector-polyline-minuseTNodeChildrenRendererNigeerianvilAarrow-collapse-downloadIconContainerequest-quote-a-leftext-sm text-center font-intermedium  text-customGray-40 text-[10px] 
```
### `text-primary-dark`
```text
py-1 rounded-full self-start mb-2
                        text-customGray-50 text-xs
                         flex-row items-center
                        font-openSauceOneMedium text-primary-dark text-base mb-1
                      

Cerebellum Academy app link 
  `;
  document.head.appendChild(style);

  var annotationRoot = document.getElementById('annotation-root') || document.body;

  function measureContentHeight() {
    if (!an
```
```text
te', data: player.getPlaybackRate()}));
true;
    at new BSONSymbol("#FFB90Bad mapping of type |
 --> <![CDATA[ \t]*[\r\n\f]+[ \t]*NotEqualTildecodePathSegmentext-lg font-semibold text-primary-dark font-inter-semiboldiving-helmetaTokensureValidHostname "<4.11.0" has not been registered. This can happen if:
 at %c%s%c com edu gov mil net news org but received one with a length of ` for plugin `runOnUI` can only be used with worklets.^([a
```
```text
flex-row items-center justify-between pb-5 flex-1 mr-6-ft-apartmentext-info-300/90NotSucceedsTildecodeURIComponentext-lg md:text-xl font-semibold text-gray-800 text-sm font-medium text-primary-dark font-inter mb-2 md:mb-0 md:flex-row gap-4 md:flex-1 border bg-white border-gray-200 rounded-lg p-3 ml-2 items-center flex-row justify-between gap-4 flex-1 p-4 rounded-xl border-customGray-5f07d5ecc9024d0596d6e2d5d2c9a7ae410d55e6f50ba8277fb43c
```
```text
stomGray-80 text-sm flex-1 bg-darkBlue-100 rounded-xl py-4 items-centergba(11, 27, 56, 0.10196078568696976)flex-1 text-[14px] text-gray-800 font-medium font-openSauceOne text-base text-primary-dark font-intersemibold text-base font-medium font-openSauceOneMedium text-primary-blue mb-1bg-secondary-purple/10 text-secondary-purple text-[10px] font-openSauceOneSemibold text-xl font-semibold text-white font-inter font-semibold text-[14px] te
```
```text
act-work-border border-primary-blue rounded-xl  px-4   bg-extras-blue10  border border-extras-blue10Unexpected end of input border border-customGray-10 px-4 py-5 pr-12 rounded-2xl text-primary-dark md:text-2xl text-lg font-medium md:w-1/2 py-8 px-4 py-8  border-t  border-b border-gray-200 py-4 border-t  border-customGray-10 mt-2 px-4 md:px-8 mt-5flex-row justify-between items-center px-4 py-5 flex-row items-center justify-between bg-whi
```
### `api/v1`
```text
pauseTourGuide must be used within TourGuideProvideriveBFSlideOutRighttps://api.whatsapp.com/send?phone=918800222009home-group-pluseInAppZoomInRighttps://app.cerebellumacademy.com/api/v1__getInternalHeighttps://apps.apple.com/in/app/whatsapp-messenger/id310633997__setInternalHeighttps://apps.apple.com/us/app/zoom-one-platform-to-connect/id546505307_worklet_7172044021294_init_dataccount-sync-outlinetwork-wifi-3-barLabelFontWeighttps://cl
```
### `QbankQuestions`
```text
 of ` for responder `setUpTests` is available only in Jest environment.Unsupported type BigInt, please use Decimal128 must take a Buffer of 16 bytes in length../../../realm/schema/QbankQuestions/actionsmidAxisLabelColoreactNativeReanimated_RotateTs1Factory[\s\r\n]|${path} is invalid array terminator bytes, expected ]]>_worklet_3196682962626_init_dataccessibilitySort bytes../../../realm/schema/TestAnalytics/actionsqsubeach-slipperformFul
```
```text
getImageSourceSyncachePoolabelBesidelayTimergeConfigstroke-tertiary-100/95unmountOnBlurlParselectNodeleteTimergeIdstroke-tertiary-200/0subpluseRenderStackBarscrollMarginTopolymergeQbankQuestionsAnswerstroke-tertiary-200/100setNativePropsDefaultelevision-shimmergeRefstroke-tertiary-200/25withReanimatedTimergeRemoteQBankAnnotationstroke-tertiary-200/30JaponyammergeTestsSessionstroke-tertiary-200/40_callTimergeUnitWithChapterIdstroke-terti
```
```text
wifi-removeNodeleteQBankAnnotationOutboxSchemagnet-sharpier-craneQUESTION_TYPE_WINDOW_STATE_CHANGEDcreateDeeplinkForQbankAnalyticsSchemagnify-close-box-multiple-outlinecommitDataddQbankQuestionsSchemagnify-minus-cursor-moveShouldSetRespondereactNativeReanimated_SlideTs3FactoryfetchQbankResultSchemagnify-minus-outlineQfrac35getQuestionIconRANK_RANGESKY_BLUE_100RCTBundleConsumercuryget RCTEventEmitterRDNAttributesAsArray-start-arrow-circl
```
```text
ationId[HotUpdater] setReloadBehavior('custom') requires a reload handler.fastAddPropertiesetRsaPublicKeyfetchPhysicalDimensionsetScreenBlurredfetchQbankDetailsetScreenFocusedfetchQbankQuestionsetScrollXfiber_renderer_arrayWithoutHolesetSecondaryPointerYfilterOutAnimatedStylesetSelectedIdxfilterOutLocationComponentFiltersetSelectedIndexfilterQuestionsetSelectedLineNumbereplaySuspendedUnitOfWorkfindAnimatedStylesetSelectedStackIndexflush
```
### `TestQuestions`
```text
est of the app. */
    body, #annotation-root {
      font-size: com edu gov mil nom org prd tm can only be attempted once. Previous history will be wiped out../../../realm/schema/TestQuestions/actionsqsuperpowershellSuspendCounters cannot be used in collections.ArubasefontWeight-trackBuyPlanClickedSomaaliarrow-u-up-left-boldisappearLayoutEffectsetProfileImagetBytesSyncreateWorkletRuntime is not available in JSWorklets.LetonianimationMa
```
```text
ceived the following types: ["&'<>`]BelicenseServerifyCertificateChainSwipeClosingStatext-background-light/0Belizeetrfill-info-0/40BenimblrarrlpointerY2BeninPassiveListenerFlagrandTestQuestionsSchemakeFromBoxdtriforceDarkOnboardingCarouselect1Bermudashvacuum-outlineBermudes3Bermudynamic_link_app_open-stack-framerate_useNativeDriverbarrettReverticalScalendar-exportKeyBesley-MediumaskGenHashOidBesley-SemiBold-mobile-altext-primary-dark/30
```
```text
torysubtractMatrices_reactNativeReanimated_matrixUtilsTsx7FactorysubtractVectors_reactNativeReanimated_matrixUtilsTsx16FactorysuspendIfUpdateReadFromEntangledAsyncActionswizzlesyncTestQuestionsWithRetrytext-2xl font-besley text-gray-900 text-left mb-2text-2xl font-semibold text-primary-dark font-inter-semiboldtext-[10px] text-customGray-50 font-medium font-openSauceOnetext-[12px] font-inter text-customGray-80 mb-6text-[14px] font-medium
```
### `TestAnalytics`
```text
loreactNativeReanimated_RotateTs1Factory[\s\r\n]|${path} is invalid array terminator bytes, expected ]]>_worklet_3196682962626_init_dataccessibilitySort bytes../../../realm/schema/TestAnalytics/actionsqsubeach-slipperformFullRefreshestCRLVISITED_ROUTE_KEYSelect Videostroke-background-dark/40#887A24mpretty-format: Options "min" and "indent" cannot be used together.<span class=" is not supported for converting to UUID. Only " contains cha
```
```text
left-12 top-1/2 z-10 mb-2FLEXIBLEritreiabsolute top-[15%] -left-[2%] w-[110px] h-[15px] rounded-2 rotate-[115deg]flex-row gap-2 items-center mt-2 -ml-1vaping-roomscrollToXYourStatsTestAnalyticsTabsolute -top-1 left-1/2 -ml-2 z-20-moz-column-gap-0_deferred_buildAnimationsMapp-store-ios-share-alternativeStart Custom QBankIcontentWindow-16 h-16 rounded-md items-center justify-center bg-extras-blue10 pt-8 pb-6 px-4 -mt-10 justify-center fle
```
```text
nUnsupported platform: Unsupported protocol version.Unsupported symmetric cipher, OID Unsupported timing function: Unsupported top level event type "Unsupported version: isUpcomingTestAnalyticsSectionUNSAFE_componentWillUpdate Readyalog()__reactInternalSnapshotBeforeUpdate available_dispatchHotspotUpdate has already been triggered by the developer-board-offill-background-900/50_handleAnimatedStylesUpdate hook called on initial render. T
```
```text
900/20_cancelPressOutDelayTimeoutdatedImagesDimensionstroke-tertiary-900/25--color-warning-background-hoverlayPropstroke-tertiary-900/30flipBitstroke-tertiary-900/40forceFullDataddTestAnalyticsProjectConfigSchemaintainVisibleContentPositiono-backpackage-dependentstroke-tertiary-900/50bounceOutUpageNumberstroke-tertiary-900/60briefcase-sharpagelinestroke-tertiary-900/70JaapanGestureHandlerPropstroke-tertiary-900/80Uarrocircamera-sharpanH
```
```text
24cc-nameByTableKey_remoteMethodTableRef_get_primary_key_columnNumbereloadAndProfile-audio-o__getNativeTagSchemailchimpactHeavyTeacherSchemainVerbarrettMulTo_checkBufferLengthandleTestAnalyticsSchemakeElementVisibleisFromCreateCustomTestSchemakeFromCircleSymbolRendererupperCaselectedTextTrackTypeg$c0Tfrac56ThetabBarHideOnKeyboardclockTickIcontroller-volume-2_worklet_2691237213530_init_dataobao-squarecognizeSelfClosingetTimestamp_makeDef
```

## Important reconstruction conclusion

The decompiler output confirms that the UI must be reconstructed from the Hermes bundle's component/route/style evidence plus the exact APK-owned assets. The screenshot files should remain visual references only. Dynamic QBank/question media is not automatically an APK-owned static image; it must be treated separately unless a runtime/API payload identifies it.

## Selected evidence files copied

- 118 selected files copied into `/mnt/data/cerebellum_decompiler_forensic`.
- Full original decompiler ZIP remains untouched.